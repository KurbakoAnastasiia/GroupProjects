package com.syntax.task2;

public class MarksTester {
    public static void main(String[] args) {
        A objA = new A(90, 94.5, 87);
        B objB = new B(98, 97.5, 76, 89);

        System.out.println(objA.getPercentage());
        System.out.println(objB.getPercentage());
    }
}
