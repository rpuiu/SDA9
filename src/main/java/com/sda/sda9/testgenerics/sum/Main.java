package com.sda.sda9.testgenerics.sum;

public class Main {

    public static void main(String[] args) {
        System.out.println(GenericNumber.getNumber(2).getClass());
        System.out.println(GenericNumber.getNumber(1.5).getClass());
        System.out.println(GenericNumber.getNumber(2000000L).getClass());
        System.out.println(GenericNumber.getNumber('3').getClass());
    }
}
