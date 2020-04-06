package com.examples.io.designpatterns.strategy;

public class Addition implements Strategy {
    @Override
    public void performOperation(int num1, int num2) {
        System.out.println("Addition is "+ (num1+num2));
    }
}
