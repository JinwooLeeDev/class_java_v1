package com.oop5;

public class GoingToSchool2 {
    public static void main(String[] args) {
        // 객체를 다양하게 생성해서 동작 시켜보고 상호 작용하는지 확인해 보자.
        Rice rice = new Rice("현미밥", 500);

        Student student1 = new Student("홍길동", 5000);

        rice.reduce(200);
        rice.reduce(200);
        rice.reduce(200);
        rice.showInfo();
    }
}
