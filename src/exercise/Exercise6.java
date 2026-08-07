package exercise;

import java.util.*;

public class Exercise6 {

    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if ((i % 2) == 0) {
                sum += i;
            }
        }
        System.out.println("입력한 숫자보다 작은 짝수들의 합은 " + sum + "입니다.");
    }
}