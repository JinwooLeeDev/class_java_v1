package io.ch06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\ljw\\workspace\\class_java_v1\\assets\\employees.zip")) {
            FileOutputStream fos = new FileOutputStream("C:\\ljw\\workspace\\class_java_v1\\assets\\employeesCopy.zip");
            long start = System.currentTimeMillis();
            byte[] data = fis.readAllBytes();
            fos.write(data);
            System.out.println("복사 완료 !");
            long end = System.currentTimeMillis();
            System.out.println("걸린 시간: " + (end - start) + "ms");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
