package com.oop12;

public class Phone {
    private String name;
    private String number;

    public Phone(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void showInfo() {
        System.out.println("====정보====");
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + number);
    }
}
