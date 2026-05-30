class Employee {
    String name = "Rushitha";
    void work() {
        System.out.println("Employee is working");
    }
}
class Manager extends Employee {
    void salary() {
        System.out.println("Salary is 30000");
    }
}
class Developer extends Manager {
    void role() {
        System.out.println("Front End Developer");
    }
}
class Inheritance {
    public static void main(String[] args) {
        Developer m = new Developer();
        System.out.println("Name : " + m.name);
        m.work();
        m.salary();
        m.role();
    }
}
