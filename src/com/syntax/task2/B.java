package com.syntax.task2;

public class B extends Marks {
    double subject1, subject2, subject3, subject4;
    double average;
    B(double sub1, double sub2, double sub3, double sub4) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
        this.subject4 = sub4;
    }
    @Override
    double getPercentage() {
        average = (subject1 + subject2 + subject3 + subject4) / 4;
        return average;
    }
}
