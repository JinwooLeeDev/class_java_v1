package ch03;

/**
 * 형변환이란?
 * 데이터의 타입을 다른 타입으로 변경 하는 것
 * - 자동 형변환, 강제 형변환
 */
public class TypeConversion2 {
    // 코드의 시작점
    public static void main(String[] args) {
        // 자동 형변환 코드 작성해보기
        double height = 170;
        System.out.println("홍길동의 키는 : " + height + "cm 입니다.");
        // 강제 형변환 코드 작성해보기
        double weight = 60.4;
        System.out.println("홍길동의 몸무게는 : " + (int) weight + "kg 입니다.");
        // 결과 출력해 보기
    } // end of main
} // end of class
