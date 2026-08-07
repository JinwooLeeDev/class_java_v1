package exercise;

import java.util.*;

public class VendingMachine {
    public static void main(String[] args) {
        final int menuNum1 = 1;
        final int menuNum2 = 2;
        final int menuNum3 = 3;
        final int menuNum4 = 4;
        final int menuNum5 = 5;
        final int menuNum6 = 6;
        final int menuNum0 = 0;
        final int cokePrice = 1500;
        final int spritePrice = 1200;
        final int waterPrice = 800;

        int cokeNum = 3;
        int spriteNum = 3;
        int waterNum = 3;

        int amount = 0;

        int cokeSellCount = 0;
        int spriteSellCount = 0;
        int waterSellCount = 0;
        int totalSellCount = 0;
        int totalSellPrice = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== 음료 자판기 =====");
            System.out.println("현재 투입 금액 : " + amount);
            if (cokeNum > 0) {
                System.out.println("1. 콜라 " + cokePrice + "원 (재고 : " + cokeNum + "개)");
            } else {
                System.out.println("1. 콜라 (품절)");
            }
            if (spriteNum > 0) {
                System.out.println("2. 사이다 " + spritePrice + "원 (재고 : " + spriteNum + "개)");
            } else {
                System.out.println("2. 사이다 (품절)");
            }
            if (waterNum > 0) {
                System.out.println("3. 물 " + waterPrice + "원 (재고 : " + waterNum + "개)");
            } else {
                System.out.println("3. 물 (품절)");
            }
            System.out.println("4. 돈 넣기");
            System.out.println("5. 잔돈 반환");
            System.out.println("6. 판매 현황");
            System.out.println("0. 종료");

            int userMenuNum = sc.nextInt();

            if (userMenuNum == menuNum1) {
                if (amount >= cokePrice && cokeNum > 0) {
                    amount -= cokePrice;
                    cokeNum--;
                    cokeSellCount++;
                    totalSellPrice += cokePrice;
                    System.out.println("콜라가 나왔습니다.");
                    System.out.println("남은 투입 금액 : " + amount);
                    continue;
                } else if (cokeNum <= 0) {
                    System.out.println("콜라가 품절되었습니다.");
                    continue;
                } else if (amount < cokePrice) {
                    System.out.println("금액이 " + (cokePrice - amount) + "원 부족합니다");
                    continue;
                }
            } else if (userMenuNum == menuNum2) {
                if (amount >= spritePrice && spriteNum > 0) {
                    amount -= spritePrice;
                    spriteNum--;
                    spriteSellCount++;
                    totalSellPrice += spritePrice;
                    System.out.println("사이다가 나왔습니다.");
                    System.out.println("남은 투입 금액 : " + amount);
                    continue;
                } else if (spriteNum <= 0) {
                    System.out.println("사이다가 품절되었습니다.");
                    continue;
                } else if (amount < spritePrice) {
                    System.out.println("금액이 " + (spritePrice - amount) + "원 부족합니다");
                    continue;
                }
            } else if (userMenuNum == menuNum3) {
                if (amount >= waterPrice && waterNum > 0) {
                    amount -= waterPrice;
                    waterNum--;
                    waterSellCount++;
                    totalSellPrice += waterPrice;
                    System.out.println("물이 나왔습니다.");
                    System.out.println("남은 투입 금액 : " + amount);
                    continue;
                } else if (waterNum <= 0) {
                    System.out.println("물이 품절되었습니다.");
                    continue;
                } else if (amount < waterPrice) {
                    System.out.println("금액이 " + (waterPrice - amount) + "원 부족합니다");
                    continue;
                }
            } else if (userMenuNum == menuNum4) {
                System.out.println("투입할 금액 : ");
                int deposit = sc.nextInt();
                if (deposit > 0) {
                    System.out.println(deposit + "원이 투입되었습니다.");
                    amount += deposit;
                    System.out.println("현재 투입 금액 : " + amount + "원");
                } else {
                    System.out.println("입금할 금액은 0을 초과해야합니다.");
                    continue;
                }
            } else if (userMenuNum == menuNum5) {
                if (amount == 0) {
                    System.out.println("반환할 금액이 없습니다.");
                    continue;
                }
                System.out.println(amount + "원이 반환되었습니다.");
                amount = 0;
            } else if (userMenuNum == menuNum6) {
                totalSellCount = cokeSellCount + spriteSellCount + waterSellCount;

                System.out.println("===== 판매 현황 =====");
                System.out.println("콜라 : " + cokeSellCount + "개 판매");
                System.out.println("사이다 : " + spriteSellCount + "개 판매");
                System.out.println("물 : " + waterSellCount + "개 판매");
                System.out.println("총 판매 수량 : " + totalSellCount + "개");
                System.out.println("총 매출 : " + totalSellPrice + "원");
            } else if (userMenuNum == menuNum0) {
                if (amount > 0) {
                    System.out.println("남은 금액 " + amount + "원이 반환되었습니다.");
                    amount = 0;
                    System.out.println("자판기를 종료합니다.");
                    System.out.println("총매출 : " + totalSellPrice + "원");
                    break;
                } else {
                    System.out.println("자판기를 종료합니다.");
                    System.out.println("총매출 : " + totalSellPrice + "원");
                    break;
                }
            } else {
                System.out.println("올바른 메뉴 번호를 입력하세요");
                continue;
            }
            sc.close();
        }
    }
}
