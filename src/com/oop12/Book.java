package com.oop12;

public class Book {
    private String title;
    private String author;
    private int totalPage;

    // 이 생성자는 외부에서 호출 불가 private 이기 때문에
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int totalPage) {
        this(title, author);
        this.totalPage = totalPage;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void showInfo() {
        System.out.println("===책 정보===");
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
        if (totalPage!=0) {
            System.out.println("총 페이지 : " + totalPage);
        }
    }
}
