package com.syntax.task2;

public class CarTester {
    public static void main(String[] args) {
        Car car1 = new Sedan(50000, 15);
        Car car2 = new Sedan(80000, 21);
        Car car3 = new Truck(250000, 1500);
        Car car4 = new Truck(300000, 2100);
        System.out.println(car1.calculateSalePrice());
        System.out.println(car2.calculateSalePrice());
        System.out.println(car3.calculateSalePrice());
        System.out.println(car4.calculateSalePrice());
    }
}
