import java.util.Scanner;
class Food {
    void showDetails() {
        System.out.println("Food Not Found");
    }
}
class Idli extends Food {
    void showDetails() {
        System.out.println("Food : Idli");
        System.out.println("Price : 30");
        System.out.println("Discount : 5");
        System.out.println("Final Price : 25");
    }
}

class Dosa extends Food {
    void showDetails() {
        System.out.println("Food : Dosa");
        System.out.println("Price : 40");
        System.out.println("Discount : 5");
        System.out.println("Final Price : 35");
    }
}

class Biryani extends Food {
    void showDetails() {
        System.out.println("Food : Biryani");
        System.out.println("Price : 180");
        System.out.println("Discount : 20");
        System.out.println("Final Price : 160");
    }
}

class Pizza extends Food {
    void showDetails() {
        System.out.println("Food : Pizza");
        System.out.println("Price : 250");
        System.out.println("Discount : 25");
        System.out.println("Final Price : 225");
    }
}

class Burger extends Food {
    void showDetails() {
        System.out.println("Food : Burger");
        System.out.println("Price : 120");
        System.out.println("Discount : 10");
        System.out.println("Final Price : 110");
    }
}

class Noodles extends Food {
    void showDetails() {
        System.out.println("Food : Noodles");
        System.out.println("Price : 100");
        System.out.println("Discount : 10");
        System.out.println("Final Price : 90");
    }
}

class Sandwich extends Food {
    void showDetails() {
        System.out.println("Food : Sandwich");
        System.out.println("Price : 80");
        System.out.println("Discount : 10");
        System.out.println("Final Price : 70");
    }
}

class Cake extends Food {
    void showDetails() {
        System.out.println("Food : Cake");
        System.out.println("Price : 150");
        System.out.println("Discount : 15");
        System.out.println("Final Price : 135");
    }
}

class IceCream extends Food {
    void showDetails() {
        System.out.println("Food : IceCream");
        System.out.println("Price : 60");
        System.out.println("Discount : 5");
        System.out.println("Final Price : 55");
    }
}

class Puri extends Food {
    void showDetails() {
        System.out.println("Food : Puri");
        System.out.println("Price : 50");
        System.out.println("Discount : 5");
        System.out.println("Final Price : 45");
    }
}

public class Foods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Food Name: ");
        String name = sc.nextLine();
        Food f;
        if(name.equalsIgnoreCase("Idli"))
            f = new Idli();
        else if(name.equalsIgnoreCase("Dosa"))
            f = new Dosa();
        else if(name.equalsIgnoreCase("Biryani"))
            f = new Biryani();
        else if(name.equalsIgnoreCase("Pizza"))
            f = new Pizza();
        else if(name.equalsIgnoreCase("Burger"))
            f = new Burger();
        else if(name.equalsIgnoreCase("Noodles"))
            f = new Noodles();
        else if(name.equalsIgnoreCase("Sandwich"))
            f = new Sandwich();
        else if(name.equalsIgnoreCase("Cake"))
            f = new Cake();
        else if(name.equalsIgnoreCase("IceCream"))
            f = new IceCream();
        else if(name.equalsIgnoreCase("Puri"))
            f = new Puri();
        else
            f = new Food();
        f.showDetails();
        sc.close();
    }
}