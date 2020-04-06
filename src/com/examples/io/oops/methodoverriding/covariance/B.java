package com.examples.io.oops.methodoverriding.covariance;

public class B extends  A {
    public  A show() {
        System.out.println("B");
        return new B();
    }

    public B test() {
        System.out.println("Object B");
        return new B();
    }
}
