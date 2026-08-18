package socket.ch04;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MultiChatServer {

    private static final int PORT = 5002;
    // Vector는 멀티스레드 환경에서 안전한 동작을 한다.
    // Why ? 자동으로 모든 메서드에 동기화처리를 하기 때문이다.
    private static Vector<PrintWriter> clientWriterList = new Vector<>();   // 클라이언트가 서버에 접속하면 그 접속한 소켓을 Vector에 넣어서 관리한다.

    private static class ClientHandler extends Thread {     // 스레드를 상속받는 ClientHandler 클래스를 만들고 필드로 소켓,
        // 소켓으로 데이터를 내보내기 위한 out, 소켓으로 데이터를 받기 위한 in을 만든다.
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        // run 메서드가 스레드 스타트 시 일하도록 약속되어 있는 메서드다
        // ** 계속 기억 해야할것 - 지금 이 클래스(ClientHandler)는 Thread 클래스를 상속받는 클래스이다.
        @Override
        public void run() {     // run은 스레드 실행 시 바로 실행되는 메서드이므로 메서드의 동작부를 구현한다.
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                // 추후에 브로드캐스트(접속자들에게 방송)하기 위해서 생성된 출력 스트림을 자료구조(벡터)에 저장
                clientWriterList.add(out);      // 접속자들의 소켓을 벡터에 넣어서

                String message;
                while ((message = in.readLine())!=null) {
                    System.out.println("수신 : " + message);
                    // A, B, C 세명 중 누구라도 메세지를 보내면
                    // 받은 메세지를 현재 연결된 모든 클라이언트에게 전송해야한다. (브로드 캐스트)
                    broadcast(message);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                // 클라이언트가 강제 종료 및 우리만의 프로토콜 exit 값이 넘어오면 서버측에서 관리하고 있는 벡터에서 소켓을 제거 해줘야 한다.
                clientWriterList.remove(out);   // 출력을 위한 스트림 제거
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        private void broadcast(String msg) {
            for (PrintWriter w : clientWriterList) {
                w.println(msg);     // clientWriterList (벡터) 에 저장된 각 소켓(클라이언트들과 연결에 사용된 소켓)에 다 방송 때려버림
            }
        }
    }




    public static void main(String[] args) {
        System.out.println("=====서버 시작=====");
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            while (true) {
                Socket socket = serverSocket.accept();
                // 클라이언트가 연결되면 새로운 객체를 생성하고 연결된 소켓 객체 주소값을 해당 클래스 필드에 할당한다.
                new ClientHandler(socket).start();  // ClientHandler 클래스는 Thread 클래스를 extends 받기 때문에 .start() 메서드 바로 호출 가능하다. (소켓 연결마다 별도의 스레드 시작)
                System.out.println("클라이언트 접속, 현재 접속자 수 : " + clientWriterList.size());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
