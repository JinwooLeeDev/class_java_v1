package ch07;

public class WhileTest1 {
    public static void main(String[] args) {
        int i = 1;
        // 무한 루프를 조심하자
        while (i <= 10) {
            System.out.println("i 값 : " + i);
            // 조건식에 처리가 없다면 무한히 반복한다.
            i++;
        }

        System.out.println("-----------------------");

        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num ++; // 조건식에 대한 처리가 반드시 필요하다
        }
        System.out.println("sum 합계 : " + sum);
    } // end of main
} // end of class
