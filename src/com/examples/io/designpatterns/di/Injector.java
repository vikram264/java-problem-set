package com.examples.io.designpatterns.di;


/**
 * The 4 roles in dependency injection
 * If you want to use this technique, you need classes that fulfill four basic roles. These are:
 *
 * The service you want to use.
 * The client that uses the service.
 * An interface that’s used by the client and implemented by the service.
 * The injector which creates a service instance and injects it into the client.
 *
 * https://www.codejava.net/coding/what-is-dependency-injection-with-java-code-example
 */
public class Injector {
    public static void main(String[] args) {
        Area area = new CircleArea();

        Shape shape = new Circle(area);
        shape.draw();

    }
}
