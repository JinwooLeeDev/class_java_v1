package exercise;
import java.util.*;

public class AtmProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int menu1 = 1;
        final int menu2 = 2;
        final int menu3 = 3;
        final int menu4 = 4;
        final int menu5 = 0;
        final int amount = 10000;
        final int DAILY_WITHDRAW_LIMIT = 50000;
        int nowAmount = amount;
        int depositTime = 0;
        int withdrawTime = 0;
        int depositTotal = 0;
        int withdrawTotal = 0;

        while(true) {
            System.out.println("===== ATM =====");
            System.out.println("1. 잔액 조회");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 거래 내역");
            System.out.println("0. 종료");
            System.out.print("선택 : ");

            int input = sc.nextInt(); sc.nextLine();
            if(input==menu1) {
                System.out.println("현재 잔액은 " + nowAmount + "원 입니다.");
            } else if (input==menu2) {
                System.out.print("입금할 금액 : ");
                int deposit = sc.nextInt(); sc.nextLine();
                if (deposit < 1) {
                    System.out.println("1 이상의 숫자를 입력해주세요");
                    continue;
                }
                System.out.println(deposit + "원이 입금되었습니다.");
                nowAmount += deposit;
                depositTime++;
                depositTotal += deposit;
                System.out.println("현재 잔액 : " + nowAmount);
            } else if (input==menu3) {
                System.out.println("출금할 금액 : ");
                int withdraw = sc.nextInt(); sc.nextLine();
                if (withdrawTotal > DAILY_WITHDRAW_LIMIT || (withdrawTotal+withdraw) > DAILY_WITHDRAW_LIMIT) {
                    System.out.println("출금 누적 금액은 50000원을 넘을 수 없습니다.");
                    continue;
                }
                if (withdraw < 1) {
                    System.out.println("1 이상의 숫자를 입력해주세요");
                    continue;
                }
                if (withdraw > nowAmount) {
                    System.out.println("잔액이 부족합니다.");
                    continue;
                }
                System.out.println(withdraw + "원이 출금되었습니다.");
                nowAmount -= withdraw;
                withdrawTime++;
                withdrawTotal += withdraw;
                System.out.println("현재 잔액 : " + nowAmount);
            } else if (input==menu4) {
                System.out.println("입금 횟수 : " + depositTime);
                System.out.println("입금 총액 : " + depositTotal);
                System.out.println("출금 횟수 : " + withdrawTime);
                System.out.println("출금 총액 : " + withdrawTotal);
            } else if (input==menu5) {
                System.out.println("ATM을 종료합니다.");
                System.out.println("최종 잔액 : " + nowAmount);
                System.out.println("총 거래 횟수 : " + (depositTime+withdrawTime));
                break;
            } else {
                System.out.println("올바론 메뉴 번호를 입력해주세요.");
            }
        }
        sc.close();
    }
}
