package com.examples.io.oops.interfaces;

public interface Animal {

    void move();


    default void eat() {
        System.out.println("All animals eat");
    }

    static void sleep() {
        System.out.println("All animals sleep");
    }
}
