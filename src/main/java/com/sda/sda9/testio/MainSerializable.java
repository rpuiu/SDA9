package com.sda.sda9.testio;

import java.io.*;

public class MainSerializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestSerializable person = new TestSerializable("Michael", "Dudikoff");
        File file = new File("D:\\Razvan\\SDA9\\src\\main\\resources\\input\\b.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream)) {
            oos.writeObject(person);
        }


        com.sda.sda9.testio.anotherpackage.TestSerializable newTestSerializable;
        try (FileInputStream fileInputStream= new FileInputStream(file);
             ObjectInputStream objectInputStream =
                     new ObjectInputStream(fileInputStream)) {
            objectInputStream.readObject();
        }

//        System.out.println(newTestSerializable);
    }
}
