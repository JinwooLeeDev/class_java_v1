package client_socket.ch05;

import java.io.IOException;
import java.net.Socket;

public class ChatClient extends client_socket.ch05.AbstractClient {
    public ChatClient(String name) {
        super(name);
    }

    @Override
    protected void connectToServer() {
        try {
            setSocket(new Socket("localhost", 5002));
        } catch (IOException e) {
            System.err.println("서버측 연결 도중 예외 발생 (IP, PORT 주소 확인)");
        }
    }

    public static void main(String[] args) {
            new ChatClient("닉네임").run();
    }
}
