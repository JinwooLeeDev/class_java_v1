package com.oop14;

public class Wizard extends Hero {
    public Wizard(String name, int hp) {
        super(name, hp);
    }

    static void freezing() {
        System.out.println("프리징 !!");
    }
}
