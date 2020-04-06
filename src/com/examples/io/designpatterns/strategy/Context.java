package com.examples.io.designpatterns.strategy;

public class Context {

    public Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doOperation(int num1,int num2) {
        strategy.performOperation( num1, num2);
    }
    public void changeStrategy(Strategy anotherStrategy){
        strategy = anotherStrategy;
    }
}
