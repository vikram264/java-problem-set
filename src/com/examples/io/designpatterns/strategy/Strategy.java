package com.examples.io.designpatterns.strategy;



public interface Strategy {
    /**
     *This pattern has two main component, Strategy interface, and Context class.
     * Strategy interface declares the type of algorithm, it can be abstract class or interface.
     * For example, you can define a Strategy interface with method performOperation(),
     * now this performOperation becomes strategy and different mathematical operation can implement this method
     * to define their operation strategy.
     *
     * Context is a class which uses a Strategy.
     */
    void performOperation(int num1 , int num2);
}
