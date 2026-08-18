package exercise;

import java.util.Scanner;

public class CafeKioskSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int ownPrice = 2500;
        int stampCount = 0;

        while (true) {
            System.out.print("주문할 아메리카노의 수량을 입력하세요 : ");
            int count = sc.nextInt(); sc.nextLine();

            if (count <= 0) {
                System.out.println("1잔 이상 주문해야 합니다.");
                break;
            }

            int totalPrice = ownPrice * count;

            System.out.println("총 결제 금액 : " + totalPrice + "원");

            if (totalPrice >= 7500) {
                System.out.println("3잔 이상 구매 서비스 스탬프 발급 :");
                for (int i=0; i<count; i++) {
                    System.out.print("* ");
                    stampCount+=1;
                    if (stampCount>2) {
                        System.out.println();
                        stampCount = 0;
                    }
                }
                System.out.println();
            }
        }
    }
}