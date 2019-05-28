package com.sda.sda9.testexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInputMismatchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x;

        try{
           x = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Input wrong, try again");
            Scanner sc2 = new Scanner(System.in);
            x = sc2.nextInt();
        }
        System.out.println(x);
    }
}
