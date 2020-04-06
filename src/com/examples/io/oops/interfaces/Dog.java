package com.examples.io.oops.interfaces;

public class Dog implements Animal {
    @Override
    public void move() {
        System.out.println("Dog is moving");
    }
    public static void sleep() {
        System.out.println("DOg is sleeping");
    }
    public static void main(String[] args) {
        Animal.sleep();
        Dog.sleep();
        Animal dog = new Dog();
        dog.move();
        dog.eat();
    }
}
