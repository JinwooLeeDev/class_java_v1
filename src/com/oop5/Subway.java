package com.oop5;

public class Subway {
    int lineNumber; // 1, 2 호선 등등
    int count; // 몇명 태웠는지
    int money; // 수익금

    // 1. 생성자
    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    // 2. 승객을 태운다
    void take(int pay) {
        money += pay;
        count++;
    }

    // 3. 정보 보기
    void showInfo() {
        System.out.println(lineNumber + "호선 지하철 정보");
        System.out.println("현재 탑승 인원 : " + count);
        System.out.println("누적 수익금 : " + money);
    }
}
