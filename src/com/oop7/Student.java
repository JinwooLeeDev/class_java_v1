package com.oop7;
import java.util.*;

public class Student {
    private String name;
    private int money;
    private int busCount;
    private int subwayCount;

    Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    void eatRice(Student student, Rice rice) {
        if (student.money >= rice.getPrice()) {
            student.money -= rice.getPrice();
            System.out.println(student.name + "학생이 밥을 먹었습니다. ");
        } else {
            System.out.println("보유 금액이 부족합니다.");
        }
    }

    void takeBus(Student student, Bus bus) {
        if (student.money >= bus.getPrice()) {
            student.money -= bus.getPrice();
            student.busCount++;
            System.out.println(student.name + "학생이 " + bus.getBusNumber() + "번 버스를 탔습니다.");
        } else {
            System.out.println("보유 금액이 부족합니다.");
        }
    }

    void takeSubway(Student student, Subway subway) {
        if (student.money >= subway.getPrice()) {
            student.money -= subway.getPrice();
            student.subwayCount++;
            System.out.println(student.name + "학생이 " + subway.getLineNumber() + "호선 지하철을 탔습니다.");
        } else {
            System.out.println("보유 금액이 부족합니다.");
        }
    }

    void showInfo(Student student) {
        System.out.println("이름 : " + student.name);
        System.out.println("잔액 : " + student.money);
        System.out.println("버스 탑승 횟수 : " + student.busCount);
        System.out.println("지하철 탑승 횟수 : " + student.subwayCount);
    }

    void deposit(Student student) {
        System.out.print("입금할 금액을 입력하세요 : ");
        int amount = sc.nextInt();

        if (amount > 0) {
            student.money += amount;
            System.out.println(student.name + "님의 잔액은 " + student.money + "입니다. ");
        } else {
            System.out.println("0보다 큰 수를 입력해주세요");
        }
    }

    void withDraw(Student student) {
        System.out.print("출금할 금액을 입력하세요 : ");
        int amount = sc.nextInt();

        if (amount > student.money || amount < 0) {
            System.out.println("출금할 수 없습니다.");
        } else {
            student.money -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        }
    }
}
