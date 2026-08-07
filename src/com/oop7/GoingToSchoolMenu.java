package com.oop7;

// 코드를 실행해 보는 측

import java.util.Scanner;

public class GoingToSchoolMenu {

    public static void main(String[] args) {
        System.out.println("====학생 시뮬레이터====");
        // 준비물
        Scanner scanner = new Scanner(System.in);
        final int EAT = 1;
        final int BUS = 2;
        final int SUBWAY = 3;
        final int MY_INFO = 4;
        final int DEPOSIT = 5;
        final int WITHDRAW = 6;
        final int END = 0;
        int userInput;

        System.out.print("학생의 이름과 초기 자금을 입력하세요 : ");
        Student student = new Student();
        student.setName(scanner.nextLine());
        student.setMoney(scanner.nextInt());
        System.out.print("식사 메뉴와 가격을 순서대로 입력하세요 : ");
        Rice rice = new Rice();
        rice.setName(scanner.nextLine());
        scanner.nextLine();
        rice.setPrice(scanner.nextInt());
        System.out.print("탑승할 버스의 번호와 가격을 순서대로 입력하세요 : ");
        Bus bus = new Bus();
        bus.setBusNumber(scanner.nextInt());
        scanner.nextLine();
        bus.setPrice(scanner.nextInt());
        System.out.print("탑승할 지하철의 호선과 가격을 순서대로 입력하세요 : ");
        Subway subway = new Subway();
        subway.setLineNumber(scanner.nextInt());
        scanner.nextLine();
        subway.setPrice(scanner.nextInt());
        System.out.println("정보 입력이 끝났습니다 입력한 정보를 토대로\n시뮬레이션을 시작합니다.");

        while (true) {
            System.out.println();
            System.out.println("====메뉴 선택====");
            System.out.println("1. 밥먹기");
            System.out.println("2. 버스타기");
            System.out.println("3. 지하철타기");
            System.out.println("4. 내 상태");
            System.out.println("5. 카드입금");
            System.out.println("6. 잔액출금");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            userInput = scanner.nextInt();

            if (userInput == EAT) {
                student.eatRice(student, rice);
            } else if (userInput == BUS) {
                student.takeBus(student, bus);
            } else if (userInput == SUBWAY) {
                student.takeSubway(student, subway);
            } else if (userInput == MY_INFO) {
                student.showInfo(student);
            } else if (userInput == DEPOSIT) {
                student.deposit(student);
            } else if (userInput == WITHDRAW) {
                student.withDraw(student);
            } else if (userInput == END) {
                break;
            } else System.out.println("올바른 번호를 입력해주세요.");
        }


    }

}
