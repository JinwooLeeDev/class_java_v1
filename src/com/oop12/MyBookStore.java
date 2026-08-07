package com.oop12;

import java.util.Objects;
import java.util.Scanner;

/**
 * 모든 프로그래밍의 기본은 C(Create) R(Read) U(Update) D(Delete) 이다.
 * 배열을 활용한 간단한 데이터 관리 시스템
 */
public class MyBookStore {
    // 현재 저장된 실제 데이터 개수를 추적하는 공유 변수(static)
    static int lastIndexNumber = 0;

    // 전체 조회하기
    public static void readAll(Book[] books) {
        System.out.println("======전체 조회 하기======");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
            }
        }
    }

    // 전체 삭제 기능 (D)
    public static void delete(Book[] books) {
        System.out.println("======전체 삭제 하기======");
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
    }

    // 선택 조회 기능
    public static void targetSearch(Scanner sc, Book[] books) {
        System.out.println(">> 선택조회 호출 됨");
        System.out.println("조회할 책 제목을 입력해 주세요 : ");
        String targetTitle = sc.nextLine();
        boolean isFind = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                // 문자열 비교는 반드시 equals() 사용
                // .trim() <-- 문자열의 앞뒤 공백 자동 제거
                if (books[i].getTitle().equals(targetTitle.trim())) {
                    System.out.println("[검색 결과]");
                    books[i].showInfo();
                    isFind = true;
                    break;
                }
            }
        }
        if (!isFind) {
            System.out.println("조회된 책 결과가 없습니다.");
        }
    }

    // 도전 과제 1
    // 선택 삭제 하는 기능 만들어 보기
    public static void targetDelete(Scanner sc, Book[] books) {
        System.out.println(">> 선택삭제 호출 됨");
        System.out.println("삭제할 책 제목을 입력해 주세요 : ");
        String targetTitle = sc.nextLine();
        boolean isFind = false;

        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(targetTitle.trim())) {
                books[i] = null;
                isFind = true;
                break;
            }
        }
        if (!isFind) {
            System.out.println("일치하는 책이 없습니다.");
        }
    }

    // 저장 기능 (C)
    public static void save(Scanner sc, Book[] books) {
        System.out.println("======저장 하기======");
        System.out.println("책의 제목을 입력하세요 : ");
        String title = sc.nextLine();
        System.out.println("책의 저자를 입력하세요 : ");
        String author = sc.nextLine();

        Book book = new Book(title, author);
        books[lastIndexNumber] = book;
        lastIndexNumber++;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[100];

        // 샘플 데이터 만들어 놓기
        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화 꽃이 피었습니다.", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘료");
        books[3] = new Book("리딩으로리드하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");
        // 샘플데이터가 5개 이므로 인덱스 관리 번호로 사용
        lastIndexNumber = 5;

        boolean flag = true;

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String DELETE_BY_TITLE = "5";
        final String END = "0";

        // 2단계 실행의 흐름 만들어 보기
        while (flag) {
            System.out.println("** 메뉴 선택 **");
            System.out.println("1. 저장 2. 전체조회 3.선택조회 4.전체삭제 5. 선택삭제 0. 종료");
            String selectedNumber = sc.nextLine();

            if (selectedNumber.equals("1")) {
                save(sc, books);
            } else if (selectedNumber.equals("2")) {
                readAll(books);
            } else if (selectedNumber.equals("3")) {
                targetSearch(sc, books);
            } else if (selectedNumber.equals("4")) {
                delete(books);
            } else if (selectedNumber.equals("5")) {
                targetDelete(sc, books);
            } else if (selectedNumber.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                flag = false;
            } else {
                System.out.println("올바른 번호를 입력하세요");
            }
        }
    }
    // 수정 기능 (U)
    public static void update() {

    }


    // 심화
    // 선택 조회 기능
    // 선택 삭제 기능


}
