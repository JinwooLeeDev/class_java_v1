package socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiThreadServer {
    public static void main(String[] args) {
        InetAddress local = null;
        try {
            local = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        final String MY_IP = local.getHostAddress();
        final String MY_HOST = local.getHostName();
        try (ServerSocket serverSocket = new ServerSocket(5001)) {  // 소켓 선언해주고
            Socket socket = serverSocket.accept();  // 연결될때가지 대기 (블로킹)
            System.out.println("===================== 서버 실행, 클라이언트 연결 됨=================");
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓에서 들어오는 내용을 inputStreamReader 형태로 받고 성능 좋은 버퍼형태로 reader로 저장
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);   // 소켓을 통해서 나갈 내용 (출력할 내용) 들을 printWriter 형태로 받을 공간 writer
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));   // System.in (키보드 입력)으로 받은 데이터를 InputStreamReader로 받고 성능 좋은 버퍼형태로 keyboardReader로 저장

            // 읽기 스레드 : 클라이언트에게 온 메시지만 수신 함
            Thread readThread = new Thread(() -> {  // 새로운 스레드 선언하고
                String clientMessage;   // clientMessage라는 이름의 String 데이터 선언
                try {
                    while ((clientMessage = reader.readLine()) != null) {   // reader는 소켓에서 들어온 내용들인데 그걸 clientMessage에 담고
                        if ("exit".equalsIgnoreCase(clientMessage)) {       // clientMessage가 exit이면 break 호출되면서 종료되고
                            System.out.println("클라이언트가 종료를 원합니다.");
                            break;
                        }
                        System.out.println("[클라이언트 측 메시지 ] : " + clientMessage);    // 그 내용을 출력하고
                    }
                } catch (IOException e) {
                    System.out.println("클라이언트가 강제로 연결을 끊었습니다.");
                }
            });

            // 쓰기 스레드
            Thread writeThread = new Thread(new Runnable() {    // 새로운 스레드 선언하고
                @Override
                public void run() {
                    String serverMessage;   // serverMessage라는 이름의 String 형태 선언하고
                    try {
                        while ((serverMessage = keyboardReader.readLine()) != null) {   // keyboardReader는 사용자의 키보드 입력을 버퍼 형태로 바꾼거니까 그걸 그대로 읽어와서 serverMessage에 넣고
                            if("ip config".equalsIgnoreCase(serverMessage)){
                                writer.println("[ IP : " + MY_IP + "]");
                                writer.println("[ HOST : " + MY_HOST + "]");
                                continue;
                            }
                            if ("exit".equalsIgnoreCase(serverMessage)) {
                                writer.println(serverMessage);      // writer는 소켓을 통해서 나갈 내용을 담는 공간이니까 그 공간에 방금 키보드로 입력받은 serverMessage 내용을 그대로 넣는다.
                                System.out.println("서버가 종료했습니다.");
                                break;
                            }
                            writer.println("[서버] 응답 메시지 " + serverMessage);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            readThread.start();     // 읽기, 쓰기 스레드 각각 시작해주고
            writeThread.start();

            readThread.join();
            writeThread.join();
            // 메인 스레드에게 내가 종료 될때까지 기다려라고 말해준다 (join)
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}