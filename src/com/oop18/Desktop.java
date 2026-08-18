package com.oop18;

public class Desktop extends Computer {
    @Override
    public void display() {
        System.out.println("화면 출력");
    }

    @Override
    public void typing() {
        System.out.println("키보드 입력");
    }
}
