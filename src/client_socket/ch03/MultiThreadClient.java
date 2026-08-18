package client_socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiThreadClient {
    public static void main(String[] args) {

        try (Socket socket = new Socket("192.168.5.101", 5002)) {
            System.out.println("서버 접속 완료");
            BufferedReader reader = new BufferedReader((new InputStreamReader(socket.getInputStream())));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 읽기 스레드 (서버측에서 들어온 데이터를 계속 받을 수 있도록 처리)
            Thread readThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = reader.readLine()) != null) {
                        // 프로토콜 1 - exit
                        if ("exit".equalsIgnoreCase(serverMessage)) {
                            System.out.println("서버가 종료를 원합니다.");
                            break;
                        }
                        System.out.println(serverMessage);
                    }
                } catch (Exception e) {
                    System.err.println("서버가 강제 종료 했습니다.");
                }
            });

            // 쓰기 스레드 (클라이언트 측 키보드 값을 입력 받아서 서버측으로 전송)
            Thread writeThread = new Thread(() -> {
                String clientMessage;
                try {
                    while ((clientMessage = keyboardReader.readLine()) != null) {
                        if ("exit".equalsIgnoreCase(clientMessage)) {
                            writer.println(clientMessage);
                            System.out.println("클라이언트 종료");
                            break;
                        }
                        writer.println(clientMessage);
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
            readThread.start();
            writeThread.start();

            readThread.join();
            writeThread.join();
            // 메인 스레드 종료로 읽기, 쓰기 스레드가 안꺼지게 join 넣어주기
            // (메인 스레드한테 나 끝내기전까지 끝내지마라 라고 말해주는거)
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
