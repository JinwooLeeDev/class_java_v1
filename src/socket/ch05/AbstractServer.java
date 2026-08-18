package socket.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public abstract class AbstractServer {
    private String name;
    private Socket socket;
    private PrintWriter socketWriterStream;
    private BufferedReader socketReaderStream;
    private BufferedReader keyboardReaderStream;

    public AbstractServer(String name) {
        this.name = name;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public final void run() {
        try {
            connectToClient();
            setupStreams();
            startCommunication();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
            } try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    protected abstract void connectToClient();

    private void setupStreams() throws IOException {
        socketWriterStream = new PrintWriter(socket.getOutputStream(), true);
        socketReaderStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        keyboardReaderStream = new BufferedReader(new InputStreamReader(System.in));
    }

    private void startCommunication() throws InterruptedException {
        Thread readThread = new Thread(() -> {
           String msg;
           try {
               while ((msg = socketReaderStream.readLine()) != null) {
                   System.out.println(msg);
               }
           } catch (Exception e) {
               System.out.println("클라이언트와의 연결이 끊겼습니다.");
           }
        });

        Thread writeThread = new Thread(() -> {
            try {
                String input;
                while ((input = keyboardReaderStream.readLine()) != null) {
                    socketWriterStream.println("[" + name + "] " + input);
                }
            } catch (IOException e) {
                System.out.println("오류 발생");
            }
        });
        readThread.start();
        writeThread.start();
        readThread.join();
        writeThread.join();
    }
}
