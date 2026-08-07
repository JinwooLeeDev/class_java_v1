package ch05;


public class Operation2 {
    // 메인함수
    public static void main(String[] args) {
        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println(5 * 3);
        System.out.println(5 / 3); // 결과 1이 나온 이유? (1.6666....) -> int / int => int 떨어지기에 소수점 버려짐
        System.out.println(5 % 3);

        // 문제
        // 1. (12 + 3) / 3 을 화면에 출력해 보세요 , 단 결과값을 변수에 담아서 출력

        double n1 = (12 + 3) / 3;
        System.out.println("(12 + 3) / 3 = " + n1);

        // 2. (25 % 2) 값을 화면에 출력해보세요
        int n2 = 25%2;
        System.out.println("25 % 2 =  " + n2);
        // 나머지 연산자는 해당하는 값이 홀수인지 짝수인지 판별할 때 유용하다
        // 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수, 1이면 홀수라고 판별할 수 있다.

        // 3. 7896456 값이 홀수인지 짝수인지 화면에 1 또는 0으로 표시하시오
        int n3 = 7896456 % 2;
        System.out.println("7896456 % 2 = " + n3);  // 0이면 짝수로 판단할 수 있다.
    } // end of main
} // end of class
