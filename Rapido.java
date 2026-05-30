class Vehicle {
    void fareDetails() {
        System.out.println("Vehicle Fare Details");
    }
}

class Auto extends Vehicle {
    void fareDetails() {
        System.out.println("Vehicle : Auto");
        System.out.println("Distance : 2 KM");
        System.out.println("Fare : 184");
    }
}

class Cab extends Vehicle {
    void fareDetails() {
        System.out.println("Vehicle : Cab");
        System.out.println("Distance : 2 KM");
        System.out.println("Fare : 250");
    }
}

class Bike extends Vehicle {
    void fareDetails() {
        System.out.println("Vehicle : Bike");
        System.out.println("Distance : 2 KM");
        System.out.println("Fare : 85");
    }
}

public class Rapido {
    public static void main(String[] args) {
        Vehicle v;
        System.out.println("Rushi books an Auto");
        v = new Auto();
        v.fareDetails();
        System.out.println();
        System.out.println("Rushi books a Cab");
        v = new Cab();
        v.fareDetails();
        System.out.println();
        System.out.println("Rushi books a Bike");
        v = new Bike();
        v.fareDetails();
    }
}