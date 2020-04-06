package com.examples.io.generics.classes;

public class TestGenericClass {

    public static void main(String[] args) {
        GenericClass <Integer> genericClass = new GenericClass<>();
        genericClass.setObj(1);


        GenericClass <String> genericClass2 = new GenericClass<>();
        genericClass2.setObj("Vikram");

        GenericClass genericClass3 = new GenericClass();
        genericClass3.setObj("Anup");
        genericClass3.setObj(10);

        int i = (int) genericClass3.get();




    }
}
