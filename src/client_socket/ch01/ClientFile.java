package client_socket.ch01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientFile {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("클라이언트 : 서버에 연결했습니다.");
            // 서버측으로 메시지를 보내기 위한 출력 스트림 사용
            // socket + PrintWriter : autoFlush 처리 됨
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            // PrintWriter <-- autoFlush를 항상 true로 해주자
            writer.println("안녕 서버야 오랜만이야 내 데이터가 들어가니?");
            writer.println("안녕 서버야 오랜만이야 내 데이터가 들어가니?2");
            writer.println("안녕 서버야 오랜만이야 내 데이터가 들어가니?3");
            writer.println("안녕 서버야 오랜만이야 내 데이터가 들어가니?4");
            writer.println("안녕 서버야 오랜만이야 내 데이터가 들어가니?5");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
