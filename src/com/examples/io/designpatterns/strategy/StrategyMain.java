package com.examples.io.designpatterns.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Context strategyApplication = new Context(new Addition());
        strategyApplication.doOperation(4,5);
        strategyApplication.changeStrategy(new Multiplication());
        strategyApplication.doOperation(4,5);
    }
}
