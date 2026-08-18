package ch08;

import java.util.*;

public class MenuChoice5 {
    public static void main(String[] args) {
        // 변수를 name 을 사용해서 CRUD 구현을 해보자.
        ArrayList<String> nameList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int END = 0;
        boolean flag = true;

        /* while (true) {
            System.out.println("\n메뉴선택");
            System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 0. 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();

            if (choice == CREATE) {
                // name변수에 스캐너를 사용해서 이름을 등록하는 기능을 구현
                System.out.println("등록을 선택했습니다");
                System.out.println("등록할 이름을 입력하세요");
                name = sc.nextLine();
            } else if (choice == READ) {
                // name안에 담겨진 값을 출력하는 기능 구현
                System.out.println("조회를 선택했습니다");
                System.out.println("등록되어 있는 이름은 " + name + "입니다.");
            } else if (choice == UPDATE) {
                // name을 수정하는 기능 구현
                System.out.println("수정을 선택했습니다");
                System.out.println("어떤 이름으로 수정할지 입력하세요");
                name = sc.nextLine();
            } else if (choice == DELETE) {
                // name을 삭제하는 기능 구현
                System.out.println("삭제를 선택했습니다");
                System.out.println("등록된 이름을 삭제합니다");
                name = "";
            } else if (choice == END) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택하세요");
            }
        } */

        while (true) {
            System.out.println("\n메뉴선택");
            System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 0. 종료");
            System.out.print("선택 : ");

            int choice = sc.nextInt();

            if (choice == CREATE) {
                // name에 등록된 값이 있다면 이미 등록되어 있습니다.
                // name변수에 스캐너를 사용해서 이름을 등록하는 기능을 구현

                System.out.println("등록을 선택했습니다");
                System.out.print("등록할 이름을 입력하시오 : ");

                sc.nextLine();
                String inputName = sc.nextLine();

                for (int i = 0; i < nameList.size(); i++) {
                    if (!flag) {
                        break;
                    }
                    if (nameList.get(i).equals(inputName)) {
                        System.out.println("이미 등록된 이름입니다.");
                        for (int j = 0; j < nameList.size(); j++) {
                            if (nameList.get(i).equals(inputName)) {
                                System.out.println("입력하신 이름은" + (j + 1) + "번으로 등록되어 있습니다.");
                                flag = false;
                                break;
                            }
                        }
                    }
                }
                if (flag) {
                    nameList.add(inputName);
                    System.out.println(inputName + "을 " + nameList.size() + "번으로 등록했습니다.");
                }
            } else if (choice == READ) {
                // 등록된 이름이 없다면 수정불가능
                // name안에 담겨진 값을 출력하는 기능 구현

                System.out.println("조회를 선택했습니다.");
                if (nameList.isEmpty()) {
                    System.out.println("등록된 이름이 없습니다. 이름을 등록해주세요.");
                    break;
                }

                System.out.println("등록된 이름들은 ");
                for (int i = 0; i < nameList.size(); i++) {
                    System.out.println((i + 1) + ". " + nameList.get(i));
                }
                System.out.println("이상입니다.");
            } else if (choice == UPDATE) {
                // name을 수정하는 기능 구현

                System.out.println("수정을 선택했습니다");
                System.out.print("몇 번 이름을 수정할지 선택하시오 : ");
                int indexNum = sc.nextInt();    sc.nextLine();

                System.out.print("어떤 이름으로 수정할지 입력하시오 : ");
                String reName = sc.nextLine();
                nameList.set(indexNum - 1, reName);

                System.out.print("수정이 완료되었습니다.");

            } else if (choice == DELETE) {
                // name을 삭제하는 기능 구현
                System.out.println("삭제를 선택했습니다");
                System.out.print("몇 번 이름을 삭제할지 선택하시오 : ");
                int indexNum = sc.nextInt();
                if (indexNum > nameList.size() || indexNum < 0) {
                    System.out.println("삭제할 이름의 올바른 번호를 입력해주세요.");
                    break;
                }
                nameList.remove(indexNum - 1);
                System.out.println("선택한 이름이 삭제되었습니다.");

            } else if (choice == END) {
                System.out.println("프로그램을 종료합니다");
                break;

            } else {
                System.out.println("잘못된 입력입니다. 다시 선택하세요");
            }
        }
    } // end of main
} // end of class
