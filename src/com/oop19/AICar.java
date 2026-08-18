package com.oop19;

public class AICar extends Car {
    @Override
    protected void drive() {
        System.out.println("자율주행을 시작합니다.");
    }

    @Override
    protected void stop() {
        System.out.println("자율주행을 정지합니다.");
    }
    // run() 재 정의 불가
}
