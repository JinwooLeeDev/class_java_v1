package client_socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class WhileClient {
    public static void main(String[] args) {
        // 주석으로 무엇을 해야할까 작성해바
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("---- 서버 연결 완료 ----");
            // 쓰기 스트림
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            // 읽기 스트림
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 키보드 스트림
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while (true) {
                System.out.println("[client]콘솔 로그 클라이언트 입력 >>>>");
                String input = keyboardReader.readLine();
                writer.println(input);
                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }
                String response = reader.readLine();
                if ("exit".equalsIgnoreCase(response)) {
                    break;
                }
                System.out.println("서버 측 응답 >>> + " + response);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
