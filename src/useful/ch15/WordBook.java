package useful.ch15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordBook {
    public static void main(String[] args) {
        // apple -> 사과

        Map<String, String> words = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        words.put("apple", "사과");
        words.put("banana", "바나나");
        words.put("cherry", "체리");

        while(true) {
            System.out.println("\n===영한 단어장===");
            System.out.println("1. 단어 추가");
            System.out.println("2. 단어 검색");
            System.out.println("3. 전체 출력");
            System.out.println("4. 종료");
            System.out.println("선택 : ");
            String choice = sc.nextLine();

            // 아래 기능을 구현해주세요

            if (choice.equals("1")) {
                System.out.println("영문 이름을 입력하세요 : ");
                String key = sc.nextLine();
                System.out.println("한글 이름을 입력하세요 : ");
                String value = sc.nextLine();
                words.put(key, value);
            } else if (choice.equals("2")) {
                System.out.println("검색할 단어를 영어로 입력하세요 : ");
                String key = sc.nextLine();
                System.out.println("입력한 영단어의 한글명은 " + words.get(key) + "입니다.");
            } else if (choice.equals("3")) {
                for (String k : words.keySet()) {
                    System.out.println(k + " : " + words.get(k));
                }
            } else if (choice.equals("4")) {
                break;
            }

        }














        // 자원 닫기
        sc.close();
    }
}
