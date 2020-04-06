package com.examples.io.oops.methodoverloading;

public class MethodOverloading {

    public void display() {
        System.out.println("Display No Args");
    }

    public String display(String s) {
        return "arg type String";
    }

    public String display(Boolean s) {
        return "arg type Boolean";
    }

    public String display(Boolean s1,Integer s2) {
        return "arg type Boolean";
    }

    public String display(Integer s1,Boolean s2) {
        return "arg type Boolean";
    }

    public void show(Object object) {
        System.out.println("Object Method Called");
    }
    public void show(Integer object) {
        System.out.println("INTEGER Method Called");
    }

    public void show(String string) {
        System.out.println("String Method Called");
    }

    public  void test(Object s1,Object s2) {
        System.out.println("Object test 2 args");
    }
    public  void test(String s1,String s2) {
        System.out.println("String test 2 args");
    }

    /*public void show(double object) {
        System.out.println("double Method Called");
    }*/
   /* public void show(int object) {
        System.out.println("int Method Called");
    }*/



}
