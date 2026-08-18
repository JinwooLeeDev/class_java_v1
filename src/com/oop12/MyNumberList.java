package com.oop12;

import java.util.Scanner;

/**
 * **요구 사항**
 * <p>
 * - **저장**: 사용자가 이름과 전화번호를 입력하여 전화번호부에 저장할 수 있어야 합니다.
 * - **조회**: 전체 연락처 목록을 조회하거나, 특정 이름으로 연락처를 검색하여 조회할 수 있어야 합니다.
 * - **수정**: 기존 연락처의 전화번호를 변경할 수 있어야 합니다.
 * - **삭제**: 전화번호부에서 연락처를 삭제할 수 있어야 합니다.
 * - **선택 조회** : 이름을 입력하면 해당 전화번호가 출력 되어야 합니다.
 * - **Scanner 활용, 입력 받는 데이터 타입은 전부 String 으로 처리**
 * - **전화번호 저장은 100까지 한정.**
 */
public class MyNumberList {
    public static void save(Scanner sc, Phone[] phones) {
        System.out.println("====저장 메뉴====");
        System.out.print("저장할 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("저장할 전화번호를 입력하세요 : ");
        String number = sc.nextLine();
        Phone phone = new Phone(name, number);

        for (int i = 0; i < phones.length; i++) {
            if (phones[i] == null) {
                phones[i] = phone;
                break;
            }
        }
    }

    public static void search(Phone[] phones) {
        System.out.println("====조회 메뉴====");
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null) {
                System.out.println("이름 : " + phones[i].getName() + "\n전화번호 : " + phones[i].getNumber());
            }
        }
    }

    public static void update(Scanner sc, Phone[] phones) {
        System.out.println("====수정 메뉴====");
        System.out.print("연락처를 변경할 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수정할 연락처를 입력하세요 : ");
        String number = sc.nextLine();
        boolean flag2 = false;

        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null) {
                if (phones[i].getName().equals(name.trim())) {
                    phones[i].setNumber(number);
                    System.out.println("수정 완료");
                    phones[i].showInfo();
                    flag2 = true;
                }
            }
        }
        if (!flag2) {
            System.out.println("입력하신 이름을 찾을 수 없습니다.");
        }
    }

    public static void delete(Scanner sc, Phone[] phones) {
        System.out.println("====삭제 메뉴====");
        System.out.println("삭제할 이름을 입력하세요 : ");
        String name = sc.nextLine();
        boolean flag2 = false;

        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null && phones[i].getName().equals(name.trim())) {
                phones[i] = null;
                System.out.println("삭제 완료");
                flag2 = true;
            }
        }
        if (!flag2) {
            System.out.println("입력한 이름을 찾을 수 없습니다.");
        }
    }

    public static void targetSearch(Scanner sc, Phone[] phones) {
        System.out.println("====선택 조회 메뉴====");
        System.out.println("조회할 이름을 입력하세요 : ");
        String name = sc.nextLine();
        boolean flag2 = false;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null && phones[i].getName().equals(name.trim())) {
                System.out.println(phones[i].getName() + "님의 전화번호는 " + phones[i].getNumber() + "입니다.");
                flag2 = true;
            }
        }
        if (!flag2) {
            System.out.println("입력하신 이름을 찾을 수 없습니다.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] phones = new Phone[100];

        phones[0] = new Phone("홍길동", "010-1234-5678");
        phones[1] = new Phone("장보고", "010-3547-5488");
        phones[2] = new Phone("이순신", "010-7893-1386");
        phones[3] = new Phone("세종대왕", "010-1833-9778");
        phones[4] = new Phone("허균", "010-2368-5695");

        final String SAVE = "1";
        final String SEARCH = "2";
        final String UPDATE = "3";
        final String DELETE = "4";
        final String TARGET_SEARCH = "5";
        final String END = "0";
        boolean flag = true;

        while (true) {
            System.out.println("====전화번호부 관리메뉴====");
            System.out.println("1. 저장 2. 조회 3. 수정 4. 삭제 5. 선택조회 0. 종료");
            String selectedNumber = sc.nextLine();

            if (selectedNumber.equals(SAVE)) {
                save(sc, phones);
            } else if (selectedNumber.equals(SEARCH)) {
                search(phones);
            } else if (selectedNumber.equals(UPDATE)) {
                update(sc, phones);
            } else if (selectedNumber.equals(DELETE)) {
                delete(sc, phones);
            } else if (selectedNumber.equals(TARGET_SEARCH)) {
                targetSearch(sc, phones);
            } else if (selectedNumber.equals(END)) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 번호를 입력하세요");
            }
        }
    }
}
