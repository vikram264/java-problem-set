package com.examples.io.generics.boundedtypeparameters.multiplebounds;

public class Cat extends Animal  {
    @Override
    void show() {

        System.out.println("Im cat and my sound is");
        sound();
    }

    @Override
    public void sound() {
        System.out.println("meow");
    }
}
