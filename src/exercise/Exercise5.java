package exercise;
import java.util.*;

public class Exercise5 {
    // 메인 함수 (코드 실행의 시작점)
    public static void main(String[] args) {
        int score;
        char grade;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요 : ");
        name = sc.nextLine();

        System.out.print("성적을 입력하세요 : ");
        score = sc.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요.");
            return;
        } else if (score >= 90) {
            grade = 'A';
            System.out.println(name + "님의 학점은 " + grade + "입니다. 우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.");
        } else if (score >= 80) {
            grade = 'B';
            System.out.println(name + "님의 학점은 " + grade + "입니다. 좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!");
        } else if (score >= 70) {
            grade = 'C';
            System.out.println(name + "님의 학점은 " + grade + "입니다. 괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.");
        } else if (score >= 60) {
            grade = 'D';
            System.out.println(name + "님의 학점은 " + grade + "입니다. 학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.");
        } else {
            grade = 'F';
            System.out.println(name + "님의 학점은 " + grade + "입니다. 불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.");
        }

    } // end of main

} // end of class