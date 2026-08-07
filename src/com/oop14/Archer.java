package com.oop14;

public class Archer extends Hero {

    public Archer(String name, int hp) {
        super(name, hp);
    }

    static void fireArrow() {
        System.out.println("파이어 애로우 !!");
    }

}
