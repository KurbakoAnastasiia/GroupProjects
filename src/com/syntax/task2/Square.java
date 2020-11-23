package com.syntax.task2;

public class Square implements Shape {
    double width;
    double area, perimeter;
    Square(double width) {
     this.width = width;
    }
    @Override
    public double calculateArea() {
       area = width * width;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 4 * width;
        return perimeter;
    }
}
