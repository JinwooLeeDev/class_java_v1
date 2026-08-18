package com.oop10;


public class MainTest1 {

    public static void main(String[] args) {
        Employee employee = new Employee("홍길동", "인사과");
        Employee employee1 = new Employee("장보고", "총무과");
        Employee employee2 = new Employee("세종대왕", "기획과");

        System.out.println(employee.getEmployeeNumber());
        System.out.println(employee1.getEmployeeNumber());
        System.out.println(employee2.getEmployeeNumber());

        Card card1 = new Card("신한카드");
        Card card2 = new Card("롯데카드");
        Card card3 = new Card("삼성카드");

        System.out.println(card1.getCardNumber());
        System.out.println(card2.getCardNumber());
        System.out.println(card3.getCardNumber());
    }

}
