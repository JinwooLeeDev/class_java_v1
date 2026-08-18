package ex_test;

public class PartTimeEmployee extends Employee{
    private int hourlyWage;
    private int workHouse;

    public PartTimeEmployee(String name, int id, int hourlyWage, int workHouse) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.workHouse = workHouse;
    }

    void printInfo() {
        System.out.println("[" + super.getId() + "] " + super.getName());
        System.out.println("이번 달 근무시간 : " + workHouse + "시간");
    }

    @Override
    public int calculatePay() {
        return hourlyWage*workHouse;
    }
}
