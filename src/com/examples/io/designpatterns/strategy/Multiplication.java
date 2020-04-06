package com.examples.io.designpatterns.strategy;

public class Multiplication implements Strategy {
    @Override
    public void performOperation(int num1, int num2) {
        System.out.println("product is "+(num1*num2));
    }
}
