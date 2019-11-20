package com.itea.java.basic.l7.shapes;

public class Application {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(4, 5);
        shapes[2] = new Triangle(3, 4, 5);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Perimeter = " + shape.perimeter());
            System.out.println("Area = " + shape.area());
        }
    }
}
