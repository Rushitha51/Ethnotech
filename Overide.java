abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    abstract void sound();
    void display() {
        System.out.println("Animal Name : " + name);
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    void sound() {
        System.out.println(name + " says Bow Bow");
    }
}
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    @Override
    void sound() {
        System.out.println(name + " says Meow Meow");
    }
}
public class Overide {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy");
        d.display();
        d.sound();
        System.out.println();
        Cat c = new Cat("Kitty");
        c.display();
        c.sound();
    }
}