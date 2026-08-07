package com.oop5;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // 메서드 1. 학생이 버스를 탄다
    void takeBus(Bus bus) {
        // 자신의 일은 직접 스스로 해결 한다.
        bus.take(1000);
        money -= 1000;
    }

    // 메서드 2. 학생이 지하철을 탄다
    void takeSubway(Subway subway) {
        subway.take(1100);
        money -= 1100;
    }

    // 메서드 3. 학생이 밥을 먹는다. (남은 양이 없으면 밥을 못먹었습니다.)
    void eatRice(Rice rice) {
        // rice.reduce(100); // --> true or false
        if (rice.reduce(100)) {
            System.out.println(name + " 님 " + rice.menu + "을 먹었습니다");
        } else {
            System.out.println("밥을 다 먹었거나 양이 부족해서 먹질 못했습니다");
        }
    }

    // 정보창 보여주는 기능
    void showInfo() {
        System.out.println(name + "님의 현재 남은 금액 : " + money);
    }

}
