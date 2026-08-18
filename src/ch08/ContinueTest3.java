package ch08;

public class ContinueTest3 {
    public static void main(String[] args) {
        // 369 게임! 1부터 30까지 세되,
        // 3, 6, 9 들어간 숫자는 "짝!" 이라고 외칩니다.
        // 13, 16, 19,
        // 23, 26, 29

        // 샘플 테스트 코드
        // 나머지 연산자와 10이라는 숫자를 활용하면 끝자리를 추출할 수 있다.
        System.out.println("369 게임 시작 !!");
        for (int i = 1; i <= 30; i++) {

            if ((i % 10) == 3) {
                System.out.println("짝");
                continue;
            }
            if ((i % 10) == 6) {
                System.out.println("짝");
                continue;
            }
            if ((i % 10) == 9) {
                System.out.println("짝");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("----------------------------------");
        // 식으로 퉁치는게 강사님 의도한 바가 아니라서 379 게임으로 바뀜
        int lastNum;
        int firstNum;
        for (int i = 1; i <= 30; i++) {
            lastNum = i % 10;
            firstNum = i / 10;
            if (lastNum == 3 || lastNum == 7 || lastNum == 9 || firstNum == 3) {
                System.out.println("짝");
                continue;
            }
            System.out.println(i);
        }
    } // end of main
} // end of class
