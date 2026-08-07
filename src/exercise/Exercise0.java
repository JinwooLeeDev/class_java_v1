package exercise;

public class Exercise0 {

    // 메인 함수 (코드 실행의 시작점)
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("==========================");

        for (int i = 0; i < 9; i += 2) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==========================");

        for (int i = 7; i > 0; i -= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } // end of main

} // end of class
