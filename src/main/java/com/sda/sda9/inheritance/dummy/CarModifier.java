package com.sda.sda9.inheritance.dummy;

import com.sda.sda9.inheritance.RaceCar;

import java.util.Arrays;
import java.util.List;

public class CarModifier {

    public String getSomething(final TestCar r){
//        r = new TestCar("ModifiedName");
        r.setName("newName");
        return r.getName();
    }

    public void moreFinal(){
        List<String> strings = Arrays.asList("aaa", "bbb", "ccc");
        for(final String s : strings){
//            s = "zzzz";
            System.out.println(s);
        }
        for(final int i = 0; true;){

        }
    }
}
