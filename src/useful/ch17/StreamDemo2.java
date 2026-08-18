package useful.ch17;

// 스트림을 만드는 방법은 크게 세 가지가 있다.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {
        // 1. 컬렉션에서 만들기
        List<String> list = Arrays.asList("사과", "바나나", "포도");
        Stream<String> s1 = list.stream();

        // 2. 배열에서 만들기
        String[] arr = {"사과", "바나나", "포도"};
        Stream<String> s2 = Arrays.stream(arr);

        // 3. 값을 직접 나열해서 만들기
        Stream<String> s3 = Stream.of("사과", "바나나", "포도");

        System.out.println("s1 개수 : " + s1.count());
        System.out.println("s2 개수 : " + s2.count());
        System.out.println("s3 개수 : " + s3.count());

        // 스트림을 만들고 사용해도 원본은 그대로이다.
        System.out.println("원본 데이터 : " + list);
    }
}
