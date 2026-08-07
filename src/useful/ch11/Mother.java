package useful.ch11;

public class Mother extends Thread{

    BankAccount bankAccount;

    public Mother(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        // 가정 ... 어머니가 5천원을 출금한다.
        bankAccount.withdraw(5000);
    }
}
