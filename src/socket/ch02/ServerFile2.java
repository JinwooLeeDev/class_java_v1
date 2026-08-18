package socket.ch02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile2 {

    // 내 IP 주소 : 192.168.5.101
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("서버측 프로그램 시작 - 포트 번호 : 5000 에서 대기중 ....");
            // 클라이언트가 내 IP 주소와, 포트번호를 사용해서 연결할 때까지 이 줄에서 멈춤 (블로킹)
            Socket socket = serverSocket.accept();

            // 읽기 스트림(문자기반) , 클라이언트 ---> 서버
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 쓰기 스트림(문자기반), 서버 ----> 클라이언트
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // 클라이언트가 보낸 데이터 한 줄 읽기
            String message = reader.readLine();
            FileOutputStream fos = null;
            fos = new FileOutputStream("C:\\ljw\\workspace\\class_java_v1\\assets\\typing.txt", true);
            System.out.println("클라이언트 메세지 : " + message);
            fos.write(message.getBytes());

            // 서버가 클라이언트로 응답 메세지 보내기
            writer.println("안녕 나는 서버야 !!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
