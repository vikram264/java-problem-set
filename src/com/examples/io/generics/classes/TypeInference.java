package com.examples.io.generics.classes;

public class TypeInference {

    public static <T> T returnType(T t) {
        return t;
    }

    public static void main(String[] args) {
        System.out.println(returnType("s"));
        System.out.println(returnType(1));
    }

}
