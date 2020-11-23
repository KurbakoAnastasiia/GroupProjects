package com.syntax.task2;

public class Sedan extends Car {
    double length;

    Sedan(double carPrice, double length) {
        super(carPrice);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            carPrice *= 0.95;
        } else {
            carPrice *= 0.9;
        }
        return carPrice;
    }
    }

