package io.ch05;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardConsoleStream {
    public static void main(String[] args) {

        // 표준 스트림 -- 3개 / 키보드에서 입력받는 표준 스트림 InputStream --> (System.in)
        // 표준 스트림 + InputStreamReader

        try (InputStreamReader reader = new InputStreamReader(System.in)) {
            // System.out.println(); --> PrintWriter (콘솔창에 출력해줌)
            PrintWriter writer = new PrintWriter(System.out, true);
            System.out.print("텍스트를 입력하세요 : ");

            int charCode;
            while ((charCode = reader.read()) != -1) {
                writer.print((char) charCode);
            }
            writer.flush(); // 강제로 버퍼에 남은 데이터를 즉시 출력

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
