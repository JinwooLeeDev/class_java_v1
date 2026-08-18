package useful.ch12;

public class Step7 {
    public static void main(String[] args) {
        int sum = 0;
        long start = System.nanoTime();
        long end = 0;
        for (int i = 1; i <= 100_000_000; i++) {
            sum += i;
            if (i==100_000_000) {
                end = System.nanoTime();
            }
        }
        long result = end - start;
        System.out.println(result/1000000 + "ms");
    }
}
