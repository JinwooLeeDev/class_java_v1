package useful.ch17;

import java.util.*;

public class Challenge1 {
    public static void main(String[] args) {
        // 도전과제 1 - Stream API를 사용하지 않고 만들어보기
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> num = new ArrayList<>();
        for (int i : numbers) {
            if ((numbers.get(i) % 2) == 0) {
                num.add(numbers.get(i)*numbers.get(i));
            }
        }
        System.out.println(num);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<Integer> result = numbers.stream().filter(n -> n % 2 == 0).map(n -> n*n).toList();
//        //                         짝수인 n 값만 모아서         그 n값들을 제곱해서     리스트에 담아라
//
//        System.out.println(result.toString());
    }
}