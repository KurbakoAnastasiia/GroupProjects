package com.syntax.task2;

public class Circle implements Shape {
    double radius;
    double area, perimeter;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        area = Math.PI * (radius * radius);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
