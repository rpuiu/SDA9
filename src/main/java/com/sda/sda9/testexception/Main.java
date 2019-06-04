package com.sda.sda9.testexception;

import com.sun.org.apache.xerces.internal.dom.AbortException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        SumCalculator s = new SumCalculator();
//        s.calculateSum(3, 5);
//        s.calculateSum(0, 5);
        doSomethingElse();
//        doSomethingSomething();
    }

    static void  doSomething() throws InvalidNumbersException, IOException {
        doSomethingSomething();
        throw new InvalidNumbersException("My exeption");
    }

    static void doSomethingElse(){
        try{
            doSomething();
        } catch (InvalidNumbersException e) {
            throw new RuntimeException("My second exception", e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void doSomethingSomething() throws InvalidNumbersException{
        throw new InvalidNumbersException("My Exception");
    }
}
