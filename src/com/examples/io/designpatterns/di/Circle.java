package com.examples.io.designpatterns.di;

public class Circle implements Shape {

    Area area;

    Circle(Area area) {
        this.area = area;
    }



    @Override
    public void draw() {
        System.out.println("Drawing a circle");
        area.calculateArea();
    }

}
