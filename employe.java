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
class Emp{
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println("Name : " + m.name);
        m.work();
        m.salary();
    }
}