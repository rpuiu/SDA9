package com.sda.sda9.javaeight;

import com.sda.sda9.testgenerics.pair.Person;

import java.util.function.Predicate;

public class AdultPersonTest implements Predicate<Person> {
    @Override
    public boolean test(Person person) {
        return person.getName().equals("Toto");
    }
}
