package com.examples.io.generics.implementingAGenericType;

import com.examples.io.generics.pojo.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImplementingAGenericType {

    public static void main(String[] args) {
        Person sherlock = new Person("Sherlock Holmes",50);
        Person john = new Person("John Watson",45);
        Person irene = new Person("Irene Adler",40);

        List<Person> people = new ArrayList<>();
        people.add(sherlock);
        people.add(john);
        people.add(irene);
        Collections.sort(people,new AgeCompartor());
        System.out.println(people);

        Collections.sort(people,new ReverseCompartor<>(new AgeCompartor()));
        System.out.println(people);
    }
}
