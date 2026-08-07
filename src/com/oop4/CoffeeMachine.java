package com.oop4;

public class CoffeeMachine {

    // 커피 머신의 상태 (필드) : 물의 양(ml), 커피 원두 양 (g)
    int water;
    int coffee;
    int count;

    // 생성자 직접 설계 해서 테스트 코드 작성해보기


    public CoffeeMachine(int water, int coffee) {
        this.water = water;
        this.coffee = coffee;
    }

    // 메서드 1. 물채우기
    void refillWater(int amount) {
        if (amount >= 0) {
            water += amount;
            System.out.println(amount + "ml의 물을 채웠습니다.");
        } else {
            System.out.println("0보다 큰 양의 물을 채워주세요");
        }
    }

    // 메서드 2. 원두 채우기
    void refillCoffee(int amount) {
        if (amount > 0) {
            coffee += amount;
            System.out.println(amount + "g의 커피원두를 채웠습니다.");
        } else {
            System.out.println("0보다 큰 양의 원두를 채워주세요");
        }
    }

    // 메서드 3. 커피 만들기
    String makeCoffee() {
        // 방어적 코드
        // 커피 한 잔에 물 100ml, 원두 10g 필요
        if (water >= 100 && coffee >= 10) {
            water -= 100;
            coffee -= 10;
            count++;
            return "맛있는 커피 한잔 완성";
        } else {
            return "재료가 부족합니다 물과 원두의 양을 확인해주세요";
        }
    }

    // 메서드 4. 해당하는 객체의 현재 상태값을 보여주는 기능 추가
    // 단, 여기서 콘솔창에 출력하는 기능(return 타입 필요 없음)

    void showInfo() {
        System.out.println("남은 물의 양 : " + water);
        System.out.println("남은 원두의 양 : " + coffee);
    }

    // 현재 해당하는 커피 머신이 몇 잔의 커피를 만들었는지 출력하는 기능을 만들어주세요
    void howMany() {
        System.out.println(count + "잔의 커피를 만들었습니다.");
    }
}
