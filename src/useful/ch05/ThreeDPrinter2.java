package useful.ch05;

public class ThreeDPrinter2 {
    Powder material;



    // 재료 꺼내기
    public Powder getMaterial() {
        return material;
    }
    // 재료 넣기
    public void setMaterial(Powder material) {
        this.material = material;
    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        Powder powder = new Powder();
        ThreeDPrinter2 threeDPrinter2 = new ThreeDPrinter2();
        threeDPrinter2.setMaterial(powder);

        System.out.println("==========================");
        System.out.println(threeDPrinter2.getMaterial());
    }
}
