package com.oop10;

import java.util.Random;

public class Calculator {

    // static 메소드 (객체 생성 없이 클래스이름.메소드이름() 사용 가능)
    // 객체마다 결과가 달라질 이유가 없으므로 static 함수가 적합하다.
    public static int add(int n1, int n2) {

        return n1 + n2;
    }

    // 일반 인스턴스 메소드 (객체를 생성해야 사용 가능) - 사실 static 메소드로 만드는것을 권장
    public int multiplay(int n1, int n2) {
        return n1 * n2;
    }

    // 사실 우리는 이미 static 을 사용하고 있었음
    public static void main(String[] args) {
        System.out.println("여기에 별도로 main 실행 가능");
        // 클래스이름.메소드이름();
        Calculator.add(1, 2);   // 가능한 이유는 static 메모리 영역에 위치 하고 실행 시킬 수 있다.

        // 자바 표준 API 사용해보기
        double ran = Math.random();  // 1. 클래스이름.메소드 라서 static 메소드이다. (굳이 객체생성 필요없음)
        System.out.println("ran : " + ran);

        // 자바 표준 API 사용해보기 - Random 사용해 보기
        Random random = new Random();

        int ranInt = random.nextInt();
        System.out.println("ranInt : " + ranInt);

        int lottoNumber1 = random.nextInt(45) + 1; // 0 ~ 44
        System.out.println(lottoNumber1);
    }
}
