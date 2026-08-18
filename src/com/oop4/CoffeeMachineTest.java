package com.oop4;

public class CoffeeMachineTest {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(5, 5);

        // 실행의 흐름 직접 만들어보기
        System.out.println(coffeeMachine.makeCoffee());

        coffeeMachine.refillWater(200);
        coffeeMachine.refillCoffee(100);

        System.out.println(coffeeMachine.makeCoffee());

        coffeeMachine.showInfo();

        coffeeMachine.howMany();
    }
}
