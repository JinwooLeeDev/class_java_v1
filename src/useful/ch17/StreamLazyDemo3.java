package useful.ch17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Stream API 지연 실행이 된다.
// 중간 연산은 호출해도 그 즉시 실행되지 않고, 최종 연산이 호출될 때 비로소 한꺼번에 실행된다.
public class StreamLazyDemo3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3);

        System.out.println("[1] 중간 연산만 호출");
        Stream<Integer> stream1 = numbers.stream().filter(n -> {
            System.out.println(" filter 실행 : ");
            return n % 2 == 1;
        });

        System.out.println("=== 여기까지 출력된 filter 로그가 있을까요 ===");

        System.out.println("[3] 최종 연산 호출해보기");
        stream1.forEach(n -> System.out.println("forEach 구문 실행(최종 연산임)" + n));

        // 중간 연산에서 조건이 만족한다면 최종연산까지 진행된다.
        // 위 코드에서는 중간연산에서 홀수 여부를 파악하고 있기 때문에 리스트의 1, 2, 3 중 홀수인 1과 3은
        // 최종연산인 forEach 구문까지 실행되고 2는 중간연산 filter 까지만 실행된다.
    }
}
