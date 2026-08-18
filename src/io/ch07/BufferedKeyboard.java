package io.ch07;

import java.io.*;

public class BufferedKeyboard {
    public static void main(String[] args) {
        // 도전 과제
        // 키보드에서 데이터를 보조 기반 스트림 활용해서 받아내고
        // 콘솔에 출력하시오.
        BufferedInputStream bis = new BufferedInputStream(System.in);
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        // 코드 구현
        System.out.println("키보드로 입력하세요 : ");
        try {
            byte[] data = bis.readAllBytes();
            bos.write(data);
            bos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
