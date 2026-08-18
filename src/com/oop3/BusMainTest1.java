package com.oop3;

public class BusMainTest1 {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        bus1.num = 115;
        bus1.color = "파란";
        bus1.speed = 60;

        Bus bus2 = new Bus();
        bus2.num = 63;
        bus2.color = "흰";
        bus2.speed = 70;

        bus1.drive();
        bus1.stop();
        System.out.println("====================================================");
        bus2.drive();
        bus2.stop();


        Student student1 = new Student();

        student1.studentID = 1;
        student1.studentName = "홍길동";
        student1.address = "부산시";
        // 객체지향 프로그래밍이란 ??
        // 객체와 객체간에 관계를 형성하고 상호작용하게 프로그래밍 하는 것.
    }
}
