package com.oop14;

public class Warrior extends Hero {
    public Warrior(String name, int hp) {
        super(name, hp);
        // 부모 클래스의 사용자 정의 생성자가 있다면 반드시 부모 생성자를 호출해야 사용할 수 있다.
    }

    static void comboAttack() {
        System.out.println("콤보 어택 !!");
    }
}
