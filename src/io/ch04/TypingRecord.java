package io.ch04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TypingRecord {
    public static void main(String[] args) {
        // 키보드에서 값을 입력받아서 내가 정의한 파일에 그대로 저장 시키는 기능
        Scanner sc = new Scanner(System.in);

        System.out.println("=====타자 연습 기록기=====");
        System.out.print("연습한 문장을 입력하세요 : ");
        String input = sc.nextLine();
        FileOutputStream fos = null;
        long startTime = System.nanoTime();

        ArrayList<String[]> list = new ArrayList<>();
        list.add(input.split(""));

        // 도전과제 1 - 입력받은 문자열을 assets/typing.txt 파일에 바로 기록해주세요
        try {
            fos = new FileOutputStream("C:\\ljw\\workspace\\class_java_v1\\assets\\typing.txt", true);
            fos.write(input.getBytes());
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            String duraiton2 = String.valueOf(duration);
            fos.write(duraiton2.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 도전과제 2 - 파일에 한 단어를 입력할 때 소요시간도 함께 표시하세요.
        sc.close();
    }
}
