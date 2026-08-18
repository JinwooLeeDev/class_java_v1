package useful.ch03;

public class StringTest2 {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("World");

        System.out.println(str1);   // 참조변수를 대입하면 --> 주소값

        // String의 실제 주소값을 확인해보자
        System.out.println(System.identityHashCode(str1));  // 해시코드값 확인 가능

        // 문자열은 불변이다.   (한번 생성된 문자열은 불변이고 변경이 일어나면 새로 문자열이 생성되는 구조이다.
        // str1 = str1 + "world";
        System.out.println("str1 + world : " + str1);
        System.out.println(System.identityHashCode(str1));  // 해시코드값 확인 가능
    }
}
