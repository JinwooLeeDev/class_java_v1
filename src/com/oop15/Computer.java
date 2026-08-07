package com.oop15;

public class Computer {
    private String owner;
    private CPU cpuClock;

    public Computer(String owner) {
        this.owner = owner;
        this.cpuClock = new CPU("3.6");
    }

    public void showInfo() {
        System.out.println(owner + "의 컴퓨터 입니다.");
        cpuClock.showClockInfo();
    }
}
