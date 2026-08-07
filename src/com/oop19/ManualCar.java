package com.oop19;

public class ManualCar extends Car {
    @Override
    protected void drive() {
        System.out.println("직접 운전을 시작합니다.");
    }

    @Override
    protected void stop() {
        System.out.println("직접 운전을 정지합니다.");
    }
}
