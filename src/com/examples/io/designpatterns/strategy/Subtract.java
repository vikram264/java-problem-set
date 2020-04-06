package com.examples.io.designpatterns.strategy;

public class Subtract implements Strategy {
    @Override
    public void performOperation(int num1, int num2) {
        System.out.println("Subtract is " + (num1-num2));
    }
}
