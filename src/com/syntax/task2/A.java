package com.syntax.task2;

public class A extends Marks {
    double subject1, subject2, subject3;
    double average;
    A(double sub1, double sub2, double sub3) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
    }
    @Override
    double getPercentage() {
        average = (subject1 + subject2 + subject3) / 3;
        return average;
    }
}
