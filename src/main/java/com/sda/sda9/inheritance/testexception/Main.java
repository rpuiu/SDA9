package com.sda.sda9.inheritance.testexception;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args)  {
        SumCalculator s = new SumCalculator();
        s.calculateSum(3, 5);
        s.calculateSum(0, 5);
    }
}
