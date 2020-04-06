package com.examples.io.generics.classes;

public class OldGenerics {

    public Object obj;


    public Object get() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        OldGenerics oldGenerics = new OldGenerics();
        oldGenerics.setObj("vikram");



        String s = (String) oldGenerics.get();
        System.out.println("s " + s);
    }
}
