package useful.ch08;

public class MainTest2 {
    public static void main(String[] args) {
        // 외부에서 들어온값들은 보통 문자열로 취급되는 경우가 많다. (스캐너, 통신)
        String str1 = "10A";    // 숫자가 아닌 문자 포함 문자열
        String str2 = "20.5";   // 실수형태의 문자열
        String str3 = "true";   // boolean 형태의 문자열

        // System.out.println("10" + 100);
        int n1;
        try {
            n1 = Integer.parseInt(str1);
            System.out.println(n1 + 100);
        } catch (Exception e) {
            System.out.println("잘못된 값입니다.");
        }

        double d = Double.parseDouble(str2);
        System.out.println(d + 0.5);

        boolean b = Boolean.parseBoolean(str3);
        System.out.println(!b);
    }
}
