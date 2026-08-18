package useful.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileExceptionHandling2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("text1.txt");
            byte[] data = fis.readAllBytes();   // 파일 전체를 읽어온다.
            String content = new String(data, StandardCharsets.UTF_8);  // 바이트로 읽어온 값을 문자열로 변환한다.

            System.out.println("=====파일 내용 시작=====");
            System.out.println(content);
            System.out.println("=====파일 내용 끝=====");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    System.out.println("파일을 닫는 도중 문제가 발생됨");
                }
            }
        }
    }
}
