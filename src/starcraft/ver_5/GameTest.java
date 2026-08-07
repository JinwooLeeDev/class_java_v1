package starcraft.ver_5;

import java.util.Scanner;

public class GameTest {

    public static void main(String[] args) {
        final int ZEALOT = 1;
        final int MARINE = 2;
        final int ZERGLING = 3;
        final int SHOW_INFO = 4;
        final int END = 0;

        Scanner sc = new Scanner(System.in);

        Unit[] units = new Unit[3];
        units[0] = new Zealot("질럿 1호");
        units[1] = new Marine("마린 1호");
        units[2] = new Zergling("저글링 1호");

        Unit selectedUnit;

        while (true) {
            System.out.println("===== 사용할 유닛 선택 =====");
            System.out.println("1. 질럿");
            System.out.println("2. 마린");
            System.out.println("3. 저글링");
            System.out.print("선택 : ");

            int choice = sc.nextInt();

            if (choice >= ZEALOT && choice <= ZERGLING) {
                selectedUnit = units[choice - 1];
                System.out.println(selectedUnit.getName() + "을(를) 선택했습니다.");
                selectedUnit.showInfo();
                break;
            }

            System.out.println("올바른 번호를 입력해 주세요.");
        }

        // 선택한 Unit 객체를 Attack 인터페이스 타입으로 바라본다.
        Attack attacker = selectedUnit;

        while (true) {
            System.out.println();
            System.out.println("===== 옵션 선택 =====");
            System.out.println("1. 질럿 공격");
            System.out.println("2. 마린 공격");
            System.out.println("3. 저글링 공격");
            System.out.println("4. 전체 상태 확인");
            System.out.println("0. 게임 종료");
            System.out.print("선택: ");

            int targetChoice = sc.nextInt();

            if (targetChoice == END) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            if (targetChoice == SHOW_INFO) {
                for (int i = 0; i < units.length; i++) {
                    units[i].showInfo();
                }
                continue;
            }

            if (targetChoice < ZEALOT || targetChoice > ZERGLING) {
                System.out.println("올바른 번호를 입력해 주세요.");
                continue;
            }

            Unit target = units[targetChoice - 1];

            if (selectedUnit == target) {
                System.out.println("자기 자신은 공격할 수 없습니다.");
                continue;
            }

            attacker.attack(target);
        }
        sc.close();
    }
}
