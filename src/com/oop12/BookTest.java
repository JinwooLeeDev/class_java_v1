package com.oop12;

// 테스트 코드 작성해보기

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new Book("플러터UI실전", "김근호", 300);
        books[1] = new Book("무궁화 꽃이 피었습니다.", "김진명", 500);
        books[2] = new Book("흐르는강물처럼", "파울로코엘료", 250);
        books[3] = new Book("리딩으로리드하라", "이지성", 450);
        books[4] = new Book("사피엔스", "유발하라리", 850);
        books[9] = new Book("홍길동전", "허균", 350);


        // book[0] 인덱스에 있는 개체의 title 출력해
        // 객체 안에 접근해서 정보 가져오기
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle());
            }
        }
    }
}

// NullPointerException <--- 객체를 생성하지 않았거나 가리키는 주소가 없을 대 오류가 발생한다.
