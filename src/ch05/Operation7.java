package ch05;

/**
 * 빠른 평가란?
 * 논리 연산에서 첫 번째 조건이 결과를 결정하는 경우
 * 두번째 조건을 평가하지 않는 것
 */

public class Operation7 {
    // 메인함수
    public static void main(String[] args) {
        int number = 5;
        int index = 0;

        // 논리곱(&&)을 사용한 빠른 평가
        // 첫번째 조건이 false 이기 때문에 논리곱에서 두번째 조건은 아예 평가되지 않음! <- 빠른 평가
        boolean result = ( (number += 10) < 10 ) && ( ( index += 2) < 10);
        System.out.println("number : " + number);
        System.out.println("index : " + index);
        System.out.println("논리곱 결과 확인 : " + result);

        System.out.println("----------------------------------------");

        // 논리합을 사용한 빠른 평가 확인
        // number 은 위에서 연산을 했기 때문에 현재 15 이다.
        // index 는 위에서 빠른 평가로 진행 했기 때문에 현재 0이다.

        boolean result2 = ( (number += 10) > 10) || ( (index += 2) < 10);
        System.out.println("result2 : " + result2);
        System.out.println("number : " + number);
        System.out.println("index : " + index);

        System.out.println("-----------------------------------------");

        // 문제 1.
        // 빠른 평가 수식을 스스로 만들어 보고 결과를 확인하는 코드를 작성하세요

        int num1 = 0;
        int num2 = 0;
        boolean result3 = ((num1 += 10)>10) || ((num2 -= 100) > 100);

        System.out.println("result3 : " + result3);
        System.out.println("num1의 초기값은 0이지만 +10이 되어 " + num1 + "이 나온다");
        System.out.println("num2의 초기값은 0이지만 빠른 평가로 인해 수식이 진행이 되지 않았기에 초기값 그대로 " + num2 + "가 나온다");

        System.out.println("------------------num1, num2 값 0으로 다시 초기화-----------------");
        num1 = 0;
        num2 = 0;
        boolean result4 = ((num1+=10) > 100) && ((num2+=100)>100);

        System.out.println("result4 : " + result4);
        System.out.println("num1의 초기값은 0이고 왼쪽 항의 계산식이 진행되기 때문에 " + num1 + "이 나온다");
        System.out.println("&&는 하나라도 false가 나오면 false 이기 때문에 앞 항에서 false가 확정되었기에 num2에는 변화가 없이 " + num2 + "가 나온다");
    } // end of main
} // end of class
