package useful.ch02;

public class SubstringMain {
    public static void main(String[] args) {
        String example = "가나다라마바사";
        System.out.println(example);
        System.out.println("-------- substring(2) 입력 후 --------");
        example = example.substring(2);
        System.out.println(example);
        System.out.println("=================================================");
        example = "가나다라마바사";
        System.out.println(example);
        System.out.println("------- substring(2, 4) 입력 후 -------");
        example = example.substring(2,4);
        System.out.println(example);
    }
}
