package useful.ch12;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Oldway {
    public static void main(String[] args) {

        // Date - JDK 1 버전에 만드렁진 클래스
        // 1. 현재 시간 출력
        Date now = new Date();
        System.out.println("현재 시간 : " + now);
        // 일단 출력 형식부터 문제이다. 영어 요일과 월 이름이 섞여 있어서 사용자 화면에 그대로 쓸 수 없음

        // 2. Date 로 특정 날짜 만들기
        Date date = new Date(2025, 4, 12);
        System.out.println("설정한 날짜 : " + date);
        // 3925년도로 결과가 확인된다.
        // Date의 연도는 1900을 기준으로 세기 때문에 2025년을 만들려고 하면 125를 직접 넣어야 한다.

        Date date2 = new Date(125, 4, 12);
        // Date month 는 0부터 시작함
        // 위와 같은 단점들 때문에 JDK 1.1 부터 곧바로 Calendar 클래스를 만들어 줬다.

        System.out.println("================================================");

        Calendar cal = Calendar.getInstance();     // new Calendar() <-- 싱글톤 패턴 구현되어 있어 메서드로 호출 해야함.
        cal.set(2025,4,12);     // 2025.5.12 이 된다.
        System.out.println(cal.getTime());

        // 위 문제들을 해결하기 위해서 8버전부터 java.time 패키지를 제공함

        LocalDate localDate = LocalDate.of(2025,5,12);  // 5월은 그냥 5로 표기
        System.out.println("설정한 날짜 : " + localDate);
    }
}
