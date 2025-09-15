package Java.OOP;

class Animal {
    void eat(){
        System.out.println("This animal eats food.");
    }
}

//child

class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
