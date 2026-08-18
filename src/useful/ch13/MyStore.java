package useful.ch13;

import java.util.ArrayList;
import java.util.List;

public class MyStore {

    public static void main(String[] args) {

        // 방법 1 : ArrayList 타입을 선언
        ArrayList<String> list1 = new ArrayList<>();

        // 방법 2: List 타입으로 선언
        List<String> list2 = new ArrayList<>();

        // 추가
        // arry[0] = "";
        list1.add("사과"); // 요소 -> 바로 뒤 -> 맨 끝에 추가, 0 번째 인덱스
        list1.add(1, "포도"); // 인덱스 1 위치에 추가

        // 조회
        list1.get(0);
        list1.size(); // 실제 안에 들어가 있는 요소의 갯수
        list1.contains("사과"); // 포함 여부 -> true / false
        list1.indexOf("사과"); // 위치 반환 , 없으면 -1 반환

        // 삭제
        list1.remove("사과"); // 값으로 삭제 방법
        list1.remove(0);  // 인덱스로도 삭제 가능
        list1.clear();  // 전체 삭제

        // 확인
        list1.isEmpty();  // 비어있는지 여부 확인 true / false

        System.out.println("--------------------------------------------");

        // 문제 1.
        // list2 사용해서 제공해주는 메서드를 직접 작성하고 결과를 출력 하시오







    } // end of main
}