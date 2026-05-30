abstract class FoodOrder {
    String customerName;
    int quantity;
    double price;
    FoodOrder(String name, int quantity, double price) {
        customerName = name;
        this.quantity = quantity;
        this.price = price;
    }
    abstract void orderFood();
    void bill() {
        double total = quantity * price;
        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("Total Bill : " + total);
    }
}

class Pizza extends FoodOrder {
    Pizza(String name, int quantity, double price) {
        super(name, quantity, price);
    }
    @Override
    void orderFood() {
        System.out.println(customerName + " ordered Pizza");
    }
}
class Burger extends FoodOrder {
    Burger(String name, int quantity, double price) {
        super(name, quantity, price);
    }
    @Override
    void orderFood() {
        System.out.println(customerName + " ordered Burger");
    }
}
public class Abstarction {
    public static void main(String[] args) {
        Pizza p = new Pizza("Rushi", 2, 150);
        p.orderFood();
        p.bill();
        System.out.println();
        Burger b = new Burger("Sweety", 3, 120);
        b.orderFood();
        b.bill();
    }
}