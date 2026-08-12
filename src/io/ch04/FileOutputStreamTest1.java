package io.ch04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    public static void main(String[] args) {
        String data = "\nHello, Java FileOutputStream ...";

        // new FileOutputStream("C:\\ljw\\workspace\\class_java_v1\\assets/c.txt");
        // 기존 파일에 있는 데이터에 덮어쓰지말고 추가하라
        // new FileOutputStream("C:\\ljw\\workspace\\class_java_v1\\assets/c.txt", true);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\ljw\\workspace\\class_java_v1\\assets\\c.txt", true);
            fos.write(97);
//            fos.write(98);
//            fos.write(99);
//
//            fos.write(data.getBytes());
//
//            // 물을 내리다. 뭐 이런 뜻
//            fos.flush();
            // 단 fos.close() 메서드를 호출하면 자동으로 flush() --> close()가 된다.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
