package ch08;

public class BreakTest2 {
    public static void main(String[] args) {
        //  문제 1. 1부터 100까지 반복문 진행
        //      2. 3의 배수만 화면에 출력하시오
        //      3. 50이상이면 반복문을 종료 시키세요
        //      4. for 구문으로 코드 작성
        //         플러스 알파로 무슨 조건을 넣어볼까 ...
        //      5.

        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0) {
                System.out.println("i의 값은 : " + i);
            }
            if (i >= 50) break;
        }
    } // end of main
} // end of class
