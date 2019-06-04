package com.sda.sda9.testio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTester {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Razvan\\SDA9\\src\\main\\resources\\input\\b.txt");
        boolean f = file.createNewFile();
//        bw.write("aaaa");
//        bw.write("BBB");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))
        ) {
            String fileLine = "aaaa";
            bw.write(fileLine);
        }
    }
}
