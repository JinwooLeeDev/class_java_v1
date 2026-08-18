package exercise;

public class Exercise7 {

    static void greet(String name) {
        System.out.println("안녕하세요 [" + name + "]님 !!");
    }

    static int square(int n1) {
        int sum = n1 * n1;
        return sum;
    }

    static String signOfNumber(int n1) {
        String answer = "";
        if (n1 == 0) {
            answer = "ZERO";
        } else if (n1 == 1) {
            answer = "positive";
        } else if (n1 == -1) {
            answer = "negative";
        }
        return answer;
    }

    static boolean checkAdult(int age) {
        boolean check;
        if (age >= 18) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    static int findMax(int array[]) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        greet("진우");

        System.out.println(square(4));

        System.out.println(signOfNumber(0));

        System.out.println(checkAdult(20));

        System.out.println(findMax(arr));
    }
}
