package com.oop5;

// 객체를 사용하고 실행해보는 테스트 측 코드
public class GoingToSchool {
    public static void main(String[] args) {
        Bus bus133 = new Bus(133);
        Bus bus57 = new Bus(57);

        Student studentKim = new Student("홍길동", 10000);
        Student studentLee = new Student("이순신", 5000);

        studentKim.takeBus(bus133);
        studentLee.takeBus(bus133);

        studentKim.showInfo(); // kim 현재 소지금
        studentLee.showInfo(); // lee 현재 소지금

        bus133.showInfo();
        System.out.println("============================================");
        Subway subway1 = new Subway(1);

        Student studentChoi = new Student("최땡땡", 10000);
        studentChoi.takeSubway(subway1);
        studentChoi.showInfo();
        subway1.showInfo();
        System.out.println("============================================");
        // 밥 메모리에 생성 - 직접 실행 흐름 만들어서 테스트
        Rice rice = new Rice("현미밥", 300);




    } // end of main
} // end of class
