package socket.ch06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 여러 클라이언트가 동시에 파일을 전송할 수 있는 파일 서버
 *
 * 프로토콜
 * [1바이트] 파일 이름 길이
 * [N바이트] 파일 이름
 * [나머지] 파일 내용
 */
public class FilesServer {

    private static final int PORT = 5000;
    private static final String UPLOAD_DIR = "C:\\ljw\\workspace\\class_java_v1\\uploads";

    public static void main(String[] args) {
        File dir = new File(UPLOAD_DIR);

        if (!dir.exists()) {
            boolean created = dir.mkdirs();
            System.out.println("업로드 폴더 생성 : " + created);
        }

        System.out.println("다중 파일 서버 시작 - 포트 : " + PORT);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            // 여러 클라이언트의 연결을 계속 받는다.
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("클라이언트 연결 : "
                        + socket.getInetAddress().getHostAddress());

                // 클라이언트마다 새로운 스레드에서 파일을 받는다.
                new Thread(() -> {
                    try (Socket clientSocket = socket) {
                        InputStream in = clientSocket.getInputStream();
                        OutputStream out = clientSocket.getOutputStream();

                        // 1단계 : 파일 이름 길이 읽기
                        int nameLength = in.read();
                        if (nameLength == -1) {
                            System.out.println("파일 정보 없이 연결이 종료되었습니다.");
                            return;
                        }

                        // 2단계 : 파일 이름 읽기
                        byte[] nameBuffer = new byte[nameLength];
                        int nameRead = 0;

                        while (nameRead < nameLength) {
                            int count = in.read(
                                    nameBuffer,
                                    nameRead,
                                    nameLength - nameRead);

                            if (count == -1) {
                                throw new IOException(
                                        "파일 이름을 받는 중에 연결이 끊겼습니다.");
                            }
                            nameRead += count;
                        }

                        String fileName = new String(nameBuffer);

                        if (fileName.contains("..")
                                || fileName.contains("/")
                                || fileName.contains("\\")) {
                            System.out.println("허용되지 않는 파일 이름입니다 : " + fileName);
                            return;
                        }

                        System.out.println("수신할 파일 이름 : " + fileName);

                        // 3단계 : 파일 내용 저장
                        File target = new File(dir, fileName);

                        try (FileOutputStream fos = new FileOutputStream(target)) {
                            byte[] buffer = new byte[4096];
                            int bytesRead;
                            long total = 0;

                            while ((bytesRead = in.read(buffer)) != -1) {
                                fos.write(buffer, 0, bytesRead);
                                total += bytesRead;
                            }

                            System.out.println("저장 완료 : "
                                    + target.getPath() + " 총 " + total + "바이트");
                        }

                        // 4단계 : 클라이언트에 완료 응답 전송
                        out.write(("업로드 성공 : " + fileName).getBytes());
                        out.flush();

                    } catch (IOException e) {
                        System.out.println("파일 수신 오류 : " + e.getMessage());
                    }
                }).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
