package useful.ch04;

public class ThrowsHandling2 {
    public static void main(String[] args) {
        Calc2 calc2 = new Calc2();
        try {
            calc2.devide(100, 0);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Calc2 {
    // 예외처리를 사용하는 사람이 직접 다룰 수 있도록 던질 수 있다. --> throws / 이 친구는 메서드 선언부에서 사용한다.
    // 강제성이 발생됨 (사용하는 측에서 반드시 처리를 해야되는 강제성이 생성됨)
    public int devide(int n1, int n2) throws DivideByZeroException {
        System.out.println("사용자 정의 예외 클래스 사용하는 방법");
        int result = 0;
        try {
            result = n1 / n2;
        } catch (Exception e) {
            throw new DivideByZeroException("0을 어떤수로 나눌 수 없음");
        }
        return result;
    }
}