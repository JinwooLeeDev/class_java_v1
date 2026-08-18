package useful.ch12;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class Step1 {
    public static void main(String[] args) {
        // 지금 이 순간의 실행 시점의 날짜 시간 가져오기
        LocalDate today = LocalDate.now();  // 날짜만
        LocalDateTime now = LocalDateTime.now();    // 날짜와 시간까지

        System.out.println("오늘 날짜 : " + today);
        System.out.println("현재 시각 : " + now);
        System.out.println("=========================================");
        // 원하는 날짜를 직접 설정할 수 있다.
        LocalDate birthday = LocalDate.of(2000,10,20);
        System.out.println("내 생일 : " + birthday);
        System.out.println("내 생일 요일 : " + birthday.getDayOfWeek());

        // 만약 한글로 표현하고 싶다면
        System.out.println(birthday.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
    }
}
