package com.sda.sda9.testgenerics.pair;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.PI;


public class Main {


    public static void main(String[] args) {
        double u = PI;
        List l = new ArrayList<  >();
        l.hashCode();
        Pair<Person, BankAccount> pair1
                = new Pair<>(new Person("gigi"), new BankAccount(1000));
        Pair<Person, SavingsAccount> pair2
                = new Pair<>(new Person("gogu"), new SavingsAccount(500));

        Pair[] pairs = {pair1, pair2};

        for(Pair p : pairs){
            Person person = (Person) p.getKey();
            Object value = p.getValue();
            try{
                BankAccount  bankAccount  = (BankAccount) value;
                System.out.println(person.getName() + "->" + bankAccount.getMoney());
            }catch (ClassCastException e){
                SavingsAccount savingsAccount = (SavingsAccount) value;
                System.out.println(person.getName() + "->" + savingsAccount.getMoney());
            }
        }
    }
}
