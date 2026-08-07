package useful.ch12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * **요구사항**
 *
 * 1. 생일이 무슨 요일이었는지 (한글로)
 * 2. 기준 날짜 시점의 만 나이
 * 3. 태어난 지 총 며칠이 지났는지
 * 4. 기준 날짜부터 크리스마스까지 D-day
 * 5. 기준 시각을 "2025년 05월 13일 오후 02시 30분" 형식으로 출력
 */

public class Step6 {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(2000, 10, 20);
        LocalDateTime DateTime = LocalDateTime.of(2025, 5, 13, 14, 30);
        LocalDate Date = DateTime.toLocalDate();
        LocalDate christmas = LocalDate.of(Date.getYear(), 12, 25);

        DateTimeFormatter korean = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분", Locale.KOREAN);

        Period age = Period.between(birth, Date);

        System.out.println("1번 : " + birth.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
        System.out.println("2번 : " + age.getYears() + "세");
        System.out.println("3번 : 총 " + ChronoUnit.DAYS.between(birth, Date) + "일");
        System.out.println("4번 : " + ChronoUnit.DAYS.between(Date, christmas) + "일");
        System.out.println("5번 : " + DateTime.format(korean));
    }
}


