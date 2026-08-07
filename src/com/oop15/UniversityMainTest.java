package com.oop15;

import java.util.Scanner;

public class UniversityMainTest {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동");
        Student student2 = new Student("김유신");
        Scanner sc = new Scanner(System.in);
        System.out.println("학교의 정원을 설정하세요 : ");
        int max = sc.nextInt();
        University university1 = new University(max);
        university1.addStudent(student1);
        university1.addStudent(student2);
        university1.uniInfo();

        System.out.println("===================");
    }
}
