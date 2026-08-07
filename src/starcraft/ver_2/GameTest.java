package starcraft.ver_2;

import java.util.Scanner;

public class GameTest {

    public static void main(String[] args) {
        final int ZEALOT = 1;
        final int MARINE = 2;
        final int ZERGLING = 3;
        final int SHOW_INFO = 4;
        final int END = 0;

        Scanner sc = new Scanner(System.in);

        Zealot zealot = new Zealot("zealot1");
        Marine marine = new Marine("marine1");
        Zergling zergling = new Zergling("zergling1");

        int choice;

        while (true) {
            System.out.println("=== 사용자 유닛 선택 ===");
            System.out.println("1. 질럿");
            System.out.println("2. 마린");
            System.out.println("3. 저글링");
            System.out.print("선택 : ");
            choice = sc.nextInt();

            if (choice == ZEALOT) {
                System.out.println("질럿을 선택했습니다.");
                zealot.showInfo();
                break;
            } else if (choice == MARINE) {
                System.out.println("마린을 선택했습니다.");
                marine.showInfo();
                break;
            } else if (choice == ZERGLING) {
                System.out.println("저글링을 선택했습니다.");
                zergling.showInfo();
                break;
            } else {
                System.out.println("올바른 번호를 입력해 주세요.");
            }
        }

        while (true) {
            System.out.println();
            System.out.println("===== 옵션 선택 =====");
            System.out.println("1. 질럿 공격");
            System.out.println("2. 마린 공격");
            System.out.println("3. 저글링 공격");
            System.out.println("4. 전체 상태 확인");
            System.out.println("0. 게임 종료");
            System.out.print("선택 : ");

            int targetChoice = sc.nextInt();

            if (targetChoice == END) {
                System.out.println("게임을 종료합니다.");
                break;
            } else if (targetChoice == SHOW_INFO) {
                zealot.showInfo();
                marine.showInfo();
                zergling.showInfo();
                continue;
            }

            if (choice == ZEALOT) {
                if (targetChoice == ZEALOT) {
                    System.out.println("자기 자신은 공격할 수 없습니다.");
                } else if (targetChoice == MARINE) {
                    if (marine.getHp() <= 0) {
                        System.out.println("이미 죽은 유닛입니다.");
                    } else {
                        System.out.println(zealot.getName() + "이 " + marine.getName() + "을 공격합니다.");
                        marine.beAttacked(zealot.getPower());
                    }
                } else if (targetChoice == ZERGLING) {
                    if (zergling.getHp() <= 0) {
                        System.out.println("이미 죽은 유닛입니다.");
                    } else {
                        System.out.println(zealot.getName() + "이 " + zergling.getName() + "을 공격합니다.");
                        zergling.beAttacked(zealot.getPower());
                    }
                } else {
                    System.out.println("올바른 번호를 입력해 주세요.");
                }
            } else if (choice == MARINE) {
                if (targetChoice == ZEALOT) {
                    if (zealot.getHp() <= 0) {
                        System.out.println("이미 죽은 유닛입니다.");
                    } else {
                        System.out.println(marine.getName() + "이 " + zealot.getName() + "을 공격합니다.");
                        zealot.beAttacked(marine.getPower());
                    }
                } else if (targetChoice == MARINE) {
                    System.out.println("자기 자신은 공격할 수 없습니다.");
                } else if (targetChoice == ZERGLING) {
                    if (zergling.getHp() <= 0) {
                        System.out.println("이미 죽은 유닛입니다.");
                    } else {
                        System.out.println(marine.getName() + "이 " + zergling.getName() + "을 공격합니다.");
                        zergling.beAttacked(marine.getPower());
                    }
                } else {
                    System.out.println("올바른 번호를 입력해 주세요.");
                }
            } else if (choice == ZERGLING) {
                if (targetChoice == ZEALOT) {
                    if (zealot.getHp() <= 0) {
                        System.out.println("이미 죽은 유닛입니다.");
                    } else {
                        System.out.println(zergling.getName() + "이 " + zealot.getName() + "을 공격합니다.");
                        zealot.beAttacked(zergling.getPower());
                    }
                } else if (targetChoice == MARINE) {
                    if (marine.getHp() <= 0) {
                        System.out.println("이미 죽은 유닛입니다.");
                    } else {
                        System.out.println(zergling.getName() + "이 " + marine.getName() + "을 공격합니다.");
                        marine.beAttacked(zergling.getPower());
                    }
                } else if (targetChoice == ZERGLING) {
                    System.out.println("자기 자신은 공격할 수 없습니다.");
                } else {
                    System.out.println("올바른 번호를 입력해 주세요.");
                }
            }
        }
    }
}
