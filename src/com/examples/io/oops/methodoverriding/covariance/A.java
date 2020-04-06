package com.examples.io.oops.methodoverriding.covariance;

public class A {

    public A show() {
        System.out.println("A");
        return new A();
    }

    public Object test() {
        System.out.println("Object");
        return  new Object();
    }
}
