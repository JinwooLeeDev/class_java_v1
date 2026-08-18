package exercise;

import java.util.*;

public class BaseballGame {
    public static void main(String[] args) {
        // 컴퓨터가 정한 서로 다른 숫자 3개를 사용자가 맞히는 게임
        // 숫자 야구 게임
        Scanner sc = new Scanner(System.in);
        System.out.println("====숫자 야구 게임을 시작합니다====");
        System.out.println("컴퓨터는 0~9까지의 서로 다른 한자리 정수 3개를 랜덤으로 뽑습니다.");
        System.out.println("사용자는 숫자 3개를 입력합니다.");
        System.out.println("숫자와 위치가 모두 같으면 Strike");
        System.out.println("숫자는 있지만 위치가 다르면 Ball");
        System.out.println("일치하는 숫자가 하나도 없으면 Out");
        System.out.println("으로 처리합니다.");

        int answer1 = (int) (Math.random() * 10);
        int answer2 = (int) (Math.random() * 10);
        int answer3 = (int) (Math.random() * 10);

        while (answer1 == answer2) {
            answer2 = (int) (Math.random() * 10);
        }
        while (answer3 == answer1 || answer3 == answer2) {
            answer3 = (int) (Math.random() * 10);
        }

        int count = 0;

        while (true) {
            int strike = 0;
            int ball = 0;
            int out = 0;
            System.out.println("0~9까지의 서로 다른 정수 3개를 입력하세요.");
            System.out.print("입력 : ");
            int userNum1 = sc.nextInt();
            int userNum2 = sc.nextInt();
            int userNum3 = sc.nextInt();

            if (userNum1 == answer1) strike++;
            if (userNum1 == answer2) ball++;
            if (userNum1 == answer3) ball++;

            if (userNum2 == answer1) ball++;
            if (userNum2 == answer2) strike++;
            if (userNum2 == answer3) ball++;

            if (userNum3 == answer1) ball++;
            if (userNum3 == answer2) ball++;
            if (userNum3 == answer3) strike++;

            if (ball == 0 && strike == 0) {
                out++;
            }

            if (userNum1 == answer1 && userNum2 == answer2 && userNum3 == answer3) {
                System.out.println("정답입니다 !! " + count + "번 시도하셨습니다.");
                break;
            }

            System.out.println(strike + "strike, " + ball + "ball" + out + "out");
            count++;
        }
    }
}
