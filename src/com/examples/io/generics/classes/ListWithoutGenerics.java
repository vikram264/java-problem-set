package com.examples.io.generics.classes;

import java.util.ArrayList;
import java.util.List;

public class ListWithoutGenerics {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Andrew");

       Object o =  list.get(0);
        Object o1 = "given";
       System.out.println(o1);
    }
}
