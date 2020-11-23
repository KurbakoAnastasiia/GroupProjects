package com.syntax.task2;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape = new Square(8);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());

        Shape shape1 = new Circle(3.8);
        System.out.println(shape1.calculateArea());
        System.out.println(shape1.calculatePerimeter());
    }
}
