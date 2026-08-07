package ex_test;

public abstract class Beverage {
    private String name;
    private int price;

    public Beverage(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    abstract void prepare();

    void serve() {
        System.out.println(name + "나왔습니다. 가격은 " + price + "입니다.");
    }
}
