package com.syntax.task2;

public class Truck extends Car {
    double weight;

    Truck(double carPrice, double weight) {
        super(carPrice);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            carPrice *= 0.9;
        } else {
            carPrice *= 0.8;
        }
        return carPrice;
    }
}
