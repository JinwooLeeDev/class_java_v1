package com.oop9;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    private double weight;

    // 1. get 메서드 만들어 주세요

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    // 2. set 메서드 만들어 주세요

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 110 || age <= 0) {
            System.out.println("나이는 0 ~ 110 사이에서만 설정 가능합니다");
            return;
        }
        this.age = age;
    }

    public void setWeight(double weight) {
        if (weight >= 110 || weight < 0) {
            System.out.println("무게는 1 ~ 110 사이에서만 설정 가능합니다");
            return;
        }
        this.weight = weight;
    }
}
