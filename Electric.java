class Bank {
    int balance = 2000;
    void deposit() {
        balance = balance + 500;
        System.out.println("After Deposit: " + balance);
    }
}
class Withdraw extends Bank {
    void withdraw() {
        balance = balance - 300;
        System.out.println("After Withdraw: " + balance);
    }
}
public class Electric {
    public static void main(String[] args) {
        Withdraw w = new Withdraw();
        System.out.println("Balance: " + w.balance);
        w.deposit();
        w.withdraw();
    }
}