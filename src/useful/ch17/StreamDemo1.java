package useful.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 나이 목록에서 18세 이상만 골라내는 코드를
 * 두 가지 방법으로 알아보자.
 */

public class StreamDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
//        List<Integer> ages = new ArrayList<>();
//        ages.add(20);
//        ages.add(50);
//        ages.add(7);

        // 방법 1. 지금까지 배웠던 방법
        List<Integer> ages = Arrays.asList(20, 11, 18, 24, 33, 40, 2);
        List<Integer> adultAges1 = new ArrayList<>();

        for (int age : ages) {
            if (age >= 18) {
                adultAges1.add(age);
            }
        }
        System.out.println("for문 방식 : " + adultAges1);

        // 방법 2. 스트림 방식 (중간연산, 최종연산)
        // 오직 함수형 인터페이스안에서만 추상 메서드의 매개변수가 하나라면 소괄호도 생략 가능하다.
        List<Integer> adultAges2 = ages.stream().filter(age -> age >= 18).toList();
        System.out.println("Stream 방식 : " + adultAges2);
        System.out.println("결과는 같다");
    }
}
