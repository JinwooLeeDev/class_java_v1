package com.oop1;

public class WarriorMainTest {
    // 코드 실행의 진입점(메인함수) - JVM - Stack(메모리)
    public static void main(String[] args) {
        // new - 키워드, Warrior() <-- 생성자 호출
        Warrior w1 = new Warrior();
        // Warrior w1; // Warrior 변수 선언

        w1.name = "올라프";
        w1.height = 2.1;
        w1.health = 3200;
        w1.attackPower = 70;
        w1.defensePower = 48;

        // w1 참조 변수에 접근해서 값을 할당해보자.
        // 객체의 접근은 . 연산자로 할 수 있다.
        System.out.println("w1 주소 값 : " + w1);
        System.out.println("w1 이름 : " + w1.name);
        System.out.println("w1 키 : " + w1.height + "m");
        System.out.println("w1 체력 : " + w1.health);
        System.out.println("w1 공격력 : " + w1.attackPower);
        System.out.println("w1 방어력 : " + w1.defensePower);

        System.out.println("======================================================");

        // Warrior 타입에 객체를 생성해서 해당 하는 상태값을 입력하고
        // 화면에 출력하시오

        Warrior w2 = new Warrior();

        w2.name = "리 신";
        w2.height = 1.7;
        w2.health = 2800;
        w2.attackPower = 67;
        w2.defensePower = 42;

        System.out.println("w2 주소 값 : " + w2);
        System.out.println("w2 이름 : " + w2.name);
        System.out.println("w2 키 : " + w2.height + "m");
        System.out.println("w2 체력 : " + w2.health);
        System.out.println("w2 공격력 : " + w2.attackPower);
        System.out.println("w2 방어력 : " + w2.defensePower);
    }
}
