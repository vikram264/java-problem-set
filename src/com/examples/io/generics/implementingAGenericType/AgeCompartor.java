package com.examples.io.generics.implementingAGenericType;

import com.examples.io.generics.pojo.Person;

import java.util.Comparator;

public class AgeCompartor implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAge(),person2.getAge());
    }
}
