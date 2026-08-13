package io.ch07;

import java.io.*;

public class FileCopy3 {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            long start = System.currentTimeMillis();
            fr = new FileReader("C:\\ljw\\workspace\\class_java_v1\\assets\\employees.zip");
            br = new BufferedReader(fr);
            String data = br.readLine();
            fw = new FileWriter("C:\\ljw\\workspace\\class_java_v1\\assets\\employeesCopy.zip");
            bw = new BufferedWriter(fw);
            long end = System.currentTimeMillis();
            bw.write(data);
            System.out.println("걸린 시간: " + (end - start) + "ms");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
