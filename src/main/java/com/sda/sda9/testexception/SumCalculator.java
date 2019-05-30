package com.sda.sda9.testexception;

public class SumCalculator {

    public int sum(int a, int b) throws InvalidNumbersException {
        if (a > 0 && b > 0) {
            return a + b;
        } else {
            throw new InvalidNumbersException("Numbers are not greater than 0");
        }
    }

    public void calculateSum(int a, int b) {
        int sum = 0;

        try {
            sum = sum(a, b);
        } catch (InvalidNumbersException | NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}
