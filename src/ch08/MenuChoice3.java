package ch08;

import java.util.Scanner;

public class MenuChoice3 {
    public static void main(String[] args) {
        // 3. 잘못된 입력을 3번 이상 입력 시 강제 종료
        // 단, 3회 이전에 제대로 된 메뉴를 눌렀다면 다시 0으로 초기화 되어야 한다.

        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int END = 0;
        Scanner sc = new Scanner(System.in);
        int errorCount = 0;

        while (true) {
            System.out.println("\n메뉴선택");
            System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 0. 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();

            if (choice == CREATE) {
                System.out.println("등록을 선택했습니다");
                errorCount = 0;
            } else if (choice == READ) {
                System.out.println("조회를 선택했습니다");
                errorCount = 0;
            } else if (choice == UPDATE) {
                System.out.println("수정을 선택했습니다");
                errorCount = 0;
            } else if (choice == DELETE) {
                System.out.println("삭제를 선택했습니다");
                errorCount = 0;
            } else if (choice == END) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                errorCount++;
                if (errorCount == 3) {
                    System.out.println("3회 이상 오입력으로 인해 프로그램이 강제로 종료됩니다.");
                    break;
                }
                System.out.println("잘못된 입력입니다. 다시 선택하세요");
            }
        }
        // 스캐너 닫기 (자원 절약)
        sc.close();
    }
}
