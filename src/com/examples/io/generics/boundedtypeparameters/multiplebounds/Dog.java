package com.examples.io.generics.boundedtypeparameters.multiplebounds;

public class Dog extends Animal {
    @Override
    void show() {
        System.out.println("Im dog and my sound is");
        sound();
    }

    @Override
    public void sound() {
        System.out.println("Bark!");
    }
}
