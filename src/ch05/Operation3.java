package ch05;

/**
 * 복합 대입 연산자
 * 대입 연산자와 다른 연산자가 함께 쓰이는 것
 */
public class Operation3 {
    // 메인함수
    public static void main(String[] args) {
        int n1 = 100;
        n1 = n1 + 1;
        n1 = n1 + 1; // 원래 값에서 + 1씩 해주고 있다.
        n1 = n1 + 1; // 귀찮음 ... 간소화 하기 위해서 복합 대입 연산자를 활용할 수 있다.

        System.out.println("------------------------------------");

        // 시작값 설정
        int score = 0;

        // score = score + 3;
        // 1. 점수 추가
        score += 3;
        System.out.println("농구 점수 3점 추가 " + score);

        // score = score - 3;
        // 2. 점수 감점
        score -= 3;
        System.out.println("농구 점수 3점 감점 " + score);

        // score = score * 2;
        // 3. 점수 두배 증가
        score *= 2;
        System.out.println("농구 점수 2배 증가 " + score);

        // score = score / 2;
        // 4. 점수 반으로 감소
        score /= 2;
        System.out.println("농구 점수 반으로 감소 " + score);

        // score = score % 3;
        // 5. 점수에 대한 나머지 연산
        score %= 3;
        System.out.println("농구 점수 3으로 나눈 나머지 점수 " + score);

    } // end of main
} // end of class
