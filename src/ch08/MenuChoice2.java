package ch08;

import java.util.Scanner;

public class MenuChoice2 {
    public static void main(String[] args) {
        // 도전 과제. (코드 추가하거나 수정)
        // 프로그램 종료 시 사용자가 메뉴를 누른 횟수를 출력할 수 있게 코드를 수정해주세요
        Scanner sc = new Scanner(System.in);

        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int END = 0;
        int count = 0;

        while (true) {
            System.out.println("\n메뉴선택");
            System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 0. 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();

            if (choice == CREATE) {
                System.out.println("등록을 선택했습니다");
                count += 1;
            } else if (choice == READ) {
                System.out.println("조회를 선택했습니다");
                count += 1;
            } else if (choice == UPDATE) {
                System.out.println("수정을 선택했습니다");
                count += 1;
            } else if (choice == DELETE) {
                System.out.println("삭제를 선택했습니다");
                count += 1;
            } else if (choice == END) {
                System.out.println("프로그램을 종료합니다");
                System.out.println("메뉴 선택 횟수 : " + count);
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택하세요");
            }

        }
    } // end of main
} // end of class
