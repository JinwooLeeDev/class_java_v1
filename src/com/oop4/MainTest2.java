package com.oop4;

public class MainTest2 {
    public static void main(String[] args) {
        // Bus 클래스의 사용자 정의 생성자 2개를 이용해서 객체를 메모리에 직접 올려보자
        Bus bus1 = new Bus(115);

        Bus bus2 = new Bus(63, 1600);

        // 생성자가 2개 이상 존재 한다면 - 생성자 오버로딩
    }
}
