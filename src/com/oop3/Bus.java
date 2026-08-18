package com.oop3;

// 버스 클래스 설계
// 속성과 행위를 설계
public class Bus {
    int num;
    String color;
    int speed;


    void drive() {
        System.out.println(num + "번 " + color + "색 버스가 " + speed + "의 속도로 운전하고 있다.");
    }

    void stop() {
        System.out.println(num + "번 " + color + "색 버스가 " + speed + "의 속도로 달리다가 멈췄다.");
    }
}
