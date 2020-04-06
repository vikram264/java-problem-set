package com.examples.io.generics.boundedtypeparameters;

import java.util.ArrayList;
import java.util.List;

public class Cage<T extends Animal> {

     void addAnimal(T t) {
       t.addAnimal();
    }


    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cage<Cat> catCage = new Cage();
        catCage.addAnimal(cat);

        Cage<Dog> dogCage = new Cage();
        dogCage.addAnimal(dog);


        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);


        for(Animal a : animals) {
            a.addAnimal();
        }


    }
}
