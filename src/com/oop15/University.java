package com.oop15;

public class University {
    private Student[] students;
    private int numStudent;
    static int maxStu;

    public University(int size) {
        this.students = new Student[size];
        this.numStudent = 0;
        maxStu = size;
    }

    public void addStudent(Student student) {
        if (numStudent >= students.length) {
            System.out.println("더 이상의 학생은 입학할 수 없습니다.");
        }
        students[numStudent] = student;
        numStudent++;
    }

    public void uniInfo() {
        int count=0;
        for (int i = 0; i < numStudent; i++) {
            students[i].studentInfo();
            count++;
        }

        System.out.println("추가 입학 가능한 학생 수 : " + (maxStu-count));
    }
}
