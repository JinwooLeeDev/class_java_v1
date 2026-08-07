package ex_test;

public abstract class Employee implements Payable {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    void printInfo() {
        System.out.println("[" + this.id + "] " + this.name);
    }

}
