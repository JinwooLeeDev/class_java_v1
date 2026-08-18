package com.oop14;

public class ChildCalMainTest {

    public static void main(String[] args) {
        ChildCal childCal = new ChildCal();

        System.out.println(childCal.sum(10, 10));
        System.out.println(childCal.multiply(10, 0));   // 오버라이드된 메서드
        System.out.println(childCal.minus(100, 1));

        // (시나리오)
        // 곱하기 기능에 n1과 n2에 0이 들어온다면 0을 입력하지 마시오 라고
        // 코드 수정 요청이 들어옴.

        // 답 ) 메서드 오버라이드 활용
    }

}
