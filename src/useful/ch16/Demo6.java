package useful.ch16;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {

        MathOperation bigger = (int x, int y) -> {
            if (x > y) {
                return x;
            }
            return y;
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("비교할 두 수를 입력하시오");
        System.out.print("첫번째 : ");
        int a = sc.nextInt();
        System.out.print("두번째 : ");
        int b = sc.nextInt();

        System.out.println("두 숫자 중 더 큰 숫자는 " + bigger.operate(a,b) + "입니다.");
    }
}
