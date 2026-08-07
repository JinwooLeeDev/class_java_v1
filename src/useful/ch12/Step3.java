package useful.ch12;

import java.time.*;

public class Step3 {
    public static void main(String[] args) {
        // Period - 나이와 D-day 구하기

        LocalDate birth = LocalDate.of(2000,5,12);
        LocalDate today = LocalDate.of(2026,8,7);
        // Period 클래스이다. 년, 월, 일 세 개의 int를 하나로 묶어서 담아두는 상자이다.
        Period age = Period.between(birth, today);

        System.out.println("나이 : " + age.getYears() + "세");
        System.out.println("정확히 : " + age.getYears() + "년" + age.getMonths() + "개월" + age.getDays() + "일");

        // Period 객체를 그대로 출력하면 안된다.
        System.out.println(age);    // 사람이 읽는 형식이 아니다.
    }
}
