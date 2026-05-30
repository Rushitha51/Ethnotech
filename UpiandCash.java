interface UPIPayment {
    void upiPay(int amount);
}

interface CashPayment {
    void cashPay(int amount);
}

class PaymentSystem implements UPIPayment, CashPayment {
    public void upiPay(int amount) {
        System.out.println("UPI Payment");
        System.out.println("Amount Paid : " + amount);
    }

    public void cashPay(int amount) {
        System.out.println("Cash Payment");
        System.out.println("Amount Paid : " + amount);
    }
}

public class UpiandCash {
    public static void main(String[] args) {
        PaymentSystem p = new PaymentSystem();
        p.upiPay(500);
        System.out.println();
        p.cashPay(300);
    }
}