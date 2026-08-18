package com.oop4;

public class CalculatorMain {
    // 두 숫자를 더하는 함수
    static int add(int a, int b) {
        return a + b;
    }

    // 두 숫자를 빼는 함수
    static int sub(int a, int b) {
        return a - b;
    }

    // 두 숫자를 곱하는 함수
    static int multiply(int a, int b) {
        return a * b;
    }

    // 두 숫자를 나누는 함수
    static double div(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없어요");
            return 0;
        }
        // 정수 / 정수 ---> 정수 (소수점 버려짐)

        // (double) 둘 중 하나라도 실수 데이터 타입이어야 소수점을 반환 한다.
        return (double) a / b;
    }

    // 짝수 판별 함수
    static void even(int a) {
        if ((a % 2) == 0) {
            System.out.println(a + "는 짝수입니다.");
        }
    }

    // 홀수 판별 함수
    static void odd(int a) {
        if ((a % 2) != 0) {
            System.out.println(a + "는 홀수입니다.");
        }
    }

    // 메인 함수
    public static void main(String[] args) {
        System.out.println("1 + 2 = " + add(1, 2));
        System.out.println("2 - 1 = " + sub(2, 1));
        System.out.println("2 * 3 = " + multiply(2, 3));
        System.out.println("4 / 2 = " + div(4, 2));

        even(4);

        odd(5);
    }
}
