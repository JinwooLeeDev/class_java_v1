package socket.ch01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerFile {
    // 내 아이피 주소 : 192.168.5.4
    public static void main(String[] args) {
        int count = 0;

        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("서버측 프로그램 시작 - 포트 번호 : 5000 에서 대기중 ...");
            // 클라이언트가 내 IP 주소와, 포트 번호를 사용해서 연결할 때 까지 이 줄에서 멈춘다
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트가 연결되었습니다.");

            // I/O 에서 배웠던 스트림을 사용해보자.
            // 스트림 체이닝 연결 socket + 브릿지(InputStreamReader) + BufferedReader

            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i<5; i++) {
                InputStream in = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String message = br.readLine();
                list.add(message);
                System.out.println("클라이언트가 보낸 메시지 : " + list.get(i));
                list.remove(message);
            }
            // 클라이언트가 보낸 데이터를 한 줄을 읽어보자.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
