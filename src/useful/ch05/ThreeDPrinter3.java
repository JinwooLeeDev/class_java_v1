package useful.ch05;

public class ThreeDPrinter3 {
    Object material;

    public Object getMaterial() {
        return material;
    }

    public void setMaterial(Object material) {
        this.material = material;
    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        Powder powder = new Powder();

        ThreeDPrinter3 printer3 = new ThreeDPrinter3();
        printer3.setMaterial(plastic);
        System.out.println(printer3.getMaterial());
        System.out.println("=======================================");
        printer3.setMaterial(powder);
        System.out.println(printer3.getMaterial());

        // 타입을 선언해서 저장 시켜 보자.
        Powder tempPowder = (Powder) printer3.getMaterial();

    }
}
