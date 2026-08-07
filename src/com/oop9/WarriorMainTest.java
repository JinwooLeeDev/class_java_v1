package com.oop9;

public class WarriorMainTest {
    public static void main(String[] args) {
        Warrior w1 = new Warrior("광폭전사");
        Warrior w2 = new Warrior("일반전사");

        // get, set 메서드 확인
        // 필요에 의해서 멤버 변수 상태값을 변경해보자. 객체의 상태 변경은 행위(멤서드)를 통해서 변경해야 한다.

        w1.setHp(80);
        w1.setLevel(2);
        w1.setName("작은전사");
        System.out.println("-----------------------------");
        System.out.println(w1.getHp());
        System.out.println(w1.getLevel());
        System.out.println(w1.getName());
    }
}
