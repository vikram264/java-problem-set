package com.examples.io.generics.classes;

public class GenericClass<T> {
    T obj;

    T get() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
