package ex_test;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee("김정규", 1001, 3200000  );
        Employee employee2 = new PartTimeEmployee("이알바", 2001, 10030, 80);
        FullTimeEmployee employee3 = new Manager("박팀장", 1002, 4000000, 500000);

        employee1.printInfo();
        System.out.println("급여 : " + employee1.calculatePay());
        System.out.println("====================");
        employee2.printInfo();
        System.out.println("급여 : " + employee2.calculatePay());
        System.out.println("====================");
        employee3.printInfo();
        System.out.println("급여 : " + employee3.calculatePay() + "원");
        System.out.println("보너스 : " + employee3.calculateBonus() + "원");
    }
}
