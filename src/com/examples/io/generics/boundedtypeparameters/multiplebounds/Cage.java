package com.examples.io.generics.boundedtypeparameters.multiplebounds;

public class Cage<T extends  Animal & AnimalSound> {


        void addAnimal(T t) {
            t.show();
        }


    public static void main(String[] args) {
        Cage <Dog> dogCage = new Cage<>();
        dogCage.addAnimal(new Dog());
    }
}
