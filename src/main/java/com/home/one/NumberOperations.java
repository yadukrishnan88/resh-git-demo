package com.home.one;

public class NumberOperations {
    private int a;
    private int b;
    private int c;
    c=10;

    public NumberOperations() {

    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public int subtractNumbers(int a, int b) {
        return a > b ? a - b : b - a;
    }

    public int multiplyNumbers(int a, int b) {
        return a * b;
    }

}
