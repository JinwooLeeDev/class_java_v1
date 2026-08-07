package exercise;

public class Exercise3 {

    // 메인 함수 (코드 실행의 시작점)
    public static void main(String[] args) {
        // 할인된 가격을 화면에 출력하는 코드 작성
        final double ORIGINAL_PRICE = 59.99;
        final double DISCOUNT_RATE = 0.3; // 30% 할인

        // 할인 계산식 찾아서 준비
        double discountPrice = ORIGINAL_PRICE * DISCOUNT_RATE;
        double price = ORIGINAL_PRICE - discountPrice;
        // 할인된 계산 금액을 변수에 담아서 화면에 출력 (단 정수값으로 출력 하시오.)
        System.out.println("할인률이 적용된 계산 금액은 " + (int)price + "입니다.");

        /*
        한번에 계산하는 방법
        double price = ORIGINAL_PRICE - (ORIGINAL_PRICE * DISCOUNT_RATE);
        System.out.println("할인률이 적용된 계산 금액은 " + (int)price + "입니다.");
         */

    } // end of main

} // end of class
