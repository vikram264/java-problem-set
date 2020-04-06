package com.examples.io.designpatterns.di;

public class CircleArea implements Area {
    @Override
    public void calculateArea() {
        System.out.println("Area of circle is pi * radius * radius");
    }
}
