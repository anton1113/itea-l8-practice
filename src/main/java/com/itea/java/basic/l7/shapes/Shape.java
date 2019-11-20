package com.itea.java.basic.l7.shapes;

/**
 * Model of the abstract shape. Does not contain any state.
 */
public class Shape {

    static {
        System.out.println("Shape static initialization block");
    }

    {
        System.out.println("Shape initialization block");
    }

    public Shape() {
        System.out.println("Shape constructor");
    }

    public double perimeter() {
        return 0;
    }

    public double area() {
        return 0;
    }
}
