class Bank
{
    int balance = 2000;
    void deposit(int amt)
    {
        this.balance = this.balance + amt;
    }
    void withdraw(int amt)
    {
        this.balance = this.balance - amt;
    }
    void show()
    {
        System.out.println(this.balance);
    }
}
public class Bankbalance
{
    public static void main(String[] args)
    {
        Bank b = new Bank();
        b.deposit(1000);
        b.withdraw(300);
        b.show();
    }
}