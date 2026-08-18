package io.ch05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStream1 {
    public static void main(String[] args) {
        writeToFile("w1.txt");
        readFromFile("w1");
    }

    // 파일에 텍스트를 쓰는 메서드 (문자 기반 스트림 사용)
    public static void writeToFile(String fileName) {

        // Read / Write
        try (FileWriter fw = new FileWriter("C:\\ljw\\workspace\\class_java_v1\\assets\\" + fileName)) {
            String text = "자바 문자 기반 스트림 예제\n";
            fw.write(text);
            fw.write("추가 문자열을 기록합니다.");
            // fw.flush();
            // 원래 기본적으로 flush를 작성해줘야함
            // 하지만 try with resource 문을 쓰고 있기때문에 자동으로 flush가 동작하고 있음
            // 만약 try with resource 문을 안쓰면 flush를 작성해줘야함
            System.out.println("파일에 텍스트를 잘 기록했습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 파일에서 텍스트를 읽는 메서드 (문자 기반 스트림 사용)
    public static void readFromFile(String fileName) {
        try (FileReader fr = new FileReader("C:\\ljw\\workspace\\class_java_v1\\assets\\" + fileName + ".txt")) {
            int charCode;
            while ((charCode = fr.read()) != -1) {
                System.out.print((char) charCode);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
