package ch06;

// import 수입하다, 가지고 오다.
import java.util.*;

public class IfTest3_1 {
    // 코드 실행의 시작점 (메인함수)
    public static void main(String[] args) {
        // 키보드에서 값을 입력받을 수 있게 해주는 도구를 사용해보자.
        Scanner sc = new Scanner(System.in);
        System.out.println("사용자의 키보드 입력값을 기다리고 있어요 ...");
        int age = sc.nextInt();

        if (age <= 7) {
            System.out.println("학교에 진학하지 않았습니다.");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            // 그 외...
            System.out.println("성인입니다.");
        }
        System.out.println("프로그램 종료");
    } // end of main
} // end of class
