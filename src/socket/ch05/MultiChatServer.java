package socket.ch05;

import java.net.ServerSocket;
import java.net.Socket;

public class MultiChatServer extends AbstractServer{
    public MultiChatServer(String name) {
        super(name);
    }

    @Override
    protected void connectToClient() {
        try {
            ServerSocket serverSocket = new ServerSocket(5002);
            Socket socket = serverSocket.accept();
        } catch (Exception e) {
            System.out.println("클라이언트 측 연결 오류 발생");
        }
    }

    public static void main(String[] args) {
        new MultiChatServer("닉네임").run();
    }
}
