package com.oop17;

public class Apple extends Fruit{

    public Apple() {
        name = "사과";
        price = 3000;
    }

    // 정률 할인 - 10퍼센트를 깎는다.
    @Override
    public void sale() {
        int discount = price / 10;
        price -= discount;
        System.out.println("사과 10% 할인 금액 : " + price);
    }
}
