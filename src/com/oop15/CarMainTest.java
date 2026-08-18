package com.oop15;

public class CarMainTest {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        car1.start();
        System.out.println("===================================");
        car1.stop();

        // 밖에서는 Engine 객체에 접근할 방법이 없다.
        // 합성 관계라고 말할 수 있다.
    }
}
