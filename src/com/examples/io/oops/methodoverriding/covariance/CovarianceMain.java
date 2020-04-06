package com.examples.io.oops.methodoverriding.covariance;

public class CovarianceMain {
    public static void main(String[] args) {
        A a = new B();
        a.show();
        a.test();
    }
}
