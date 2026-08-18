package com.oop15;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void studentInfo () {
        System.out.println("학생 이름 : " + name);
    }
}
