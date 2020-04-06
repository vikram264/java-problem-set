package com.examples.io.designpatterns.di;

public class TriangleArea implements Area{
    @Override
    public void calculateArea() {
        System.out.println("The area of triangle is base * height");
    }
}
