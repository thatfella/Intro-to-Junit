package com.company.java.java;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Illegal argument");
        else
            return a / b;
    }
}
