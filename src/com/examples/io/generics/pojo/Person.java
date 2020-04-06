package com.examples.io.generics.pojo;

import java.util.Objects;

public class Person {

    String name;
    int age;


    public Person(String name, int age) {
        Objects.requireNonNull(name);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
