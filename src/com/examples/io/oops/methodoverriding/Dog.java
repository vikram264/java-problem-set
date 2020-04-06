package com.examples.io.oops.methodoverriding;

public class Dog extends  Animal {
    public void move() {
        System.out.println("DOg Move");
    }

    public void eat() {
        System.out.println("Dog eating");
    }

    public static void sleep() {
        System.out.println("Dog Sleep");
    }

    public static void main(String[] args) {
        Animal.sleep();
        Dog.sleep();
        Animal dog = new Dog();
        dog.eat();
    }
}
