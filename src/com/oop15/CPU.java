package com.oop15;

public class CPU {
    private String clock;

    public CPU(String clock) {
        this.clock = clock;
    }

    public void showClockInfo() {
        System.out.println("클럭 : " + clock + "ghz");
    }
}
