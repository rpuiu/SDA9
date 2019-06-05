package com.sda.sda9.javaeight;

import com.sda.sda9.testgenerics.pair.Person;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Throwable {
        //Java 7
        Person person = new Person("Toto");
        AdultPersonTest  adultPersonTest = new AdultPersonTest();
        System.out.println(adultPersonTest.test(person));

        //Java 8 Lambda Predicate
        Predicate<Person> personPredicate = p -> p.getName().equals("Toto");
        System.out.println(personPredicate.test(person));

        Predicate<String> stringPredicate = s -> s.contains("aaa");
        System.out.println(stringPredicate.test("bbbaabnnb"));

        //Lambda no parameter
        Runnable r = () -> System.out.println("Runnable print");
        r.run();

        //Function interface
        Function<String, Integer> function = s -> s.length();
        System.out.println(function.apply("aaaaa"));

        Function<String, String> stringFunction = t -> t.replace('a', 'A');
        System.out.println(stringFunction.apply("aabbaa"));

        //Method reference
        Function<String, Integer> methodReference = String::length;
        System.out.println(methodReference.apply("aaaaaaa"));

        Function<Person, String> personStringFunction = Person::addToName;
        Person gigi = new Person("gigi");
        System.out.println(personStringFunction.apply(gigi));

        //Supplier
        Supplier<Integer> stringSupplier = () -> new Random().nextInt();
        System.out.println(stringSupplier.get());

        //Consumer
        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("stringConsumer");
        Consumer<String> methodReferenceConsumer = System.out::println;
        methodReferenceConsumer.accept("methodReferenceConsumer");

        //Operator
        UnaryOperator<String> unaryOperator = i -> i + " " + i;
        System.out.println(unaryOperator.apply("bbb"));

        BinaryOperator<Integer> binaryOperator = (i,j) -> i * j;
        System.out.println(binaryOperator.apply(5,7));

        //Block of code
        Function<String, String> replaceVowels = s -> {
            StringBuilder sb = new StringBuilder();
            for(int x=0; x<s.length(); x++){
                char ch = s.charAt(x);
                if("aeiou".indexOf(ch)>-1){
                    sb.append(Character.toUpperCase(ch));
                }else {sb.append(ch);
                }
            }
            return sb.toString();
        };

        System.out.println(replaceVowels.apply("aabbeeAb"));

        //Custom Functional interface
        SumFunctionalInterface sumF = (g,h) -> g + h;
        System.out.println(sumF.calculate(100,54));

            //with method reference (int calculate(int a, int b){return Integer.calculate(a,b)})
        SumFunctionalInterface methodRef = Integer::sum;
        System.out.println(sumF.calculate(100,54));

        //Optionals
        Optional x = Optional.ofNullable(null);
        System.out.println(x.orElse("NULL"));

        Optional optional = Optional.ofNullable(888); //if null it will throw exception;
        System.out.println(optional.orElseThrow(()->new RuntimeException("Not present")));

        Optional<String> stringOptional = Optional.of("Aaa");
        System.out.println(stringOptional.isPresent());
        stringOptional.ifPresent(System.out::println);

        //Streams

            //Any name that contains o
        List<String> names = Arrays.asList("Ana","Ion", "Bob", "Zoe", "Costel");
        Optional<String> a = names.stream().filter(i -> i.contains("o")).findAny();
        System.out.println(a.get());
            //All names that contain o
        List<String> all = names.stream().filter(i -> i.contains("o")).collect(Collectors.toList());
        System.out.println(all);
            //Length of each name
        List<Integer> lenghts = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lenghts);

            //Names to uppercase
        List<String> u = names.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(u);

            //All match / Any match
        boolean match = names.stream().anyMatch(i->i.contains("o"));
        System.out.println(match);

            //forEach
        names.stream().forEach(System.out::println);

    }
}
