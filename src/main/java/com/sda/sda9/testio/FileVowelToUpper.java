package com.sda.sda9.testio;

import javax.xml.stream.events.Characters;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileVowelToUpper {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Razvan\\SDA9\\src\\main\\resources\\input\\a.txt");
        List<String> lines = Files.readAllLines(path);
        System.out.println(lines);

        List<String> newList = vowelsToUpperCase(lines);
        Path newDir = Paths.get("D:\\Razvan\\SDA9\\src\\main\\resources\\output");
        if(Files.notExists(newDir)) {
            Files.createDirectory(newDir);
        }

        Path newFilePath = newDir.resolve("b.txt");
        if(Files.notExists(newFilePath)){
//            Files.createFile(newFilePath); //Redundant
            Files.write(newFilePath,newList);
        }else{
            Files.write(newFilePath, newList, StandardOpenOption.APPEND);
        }


        System.out.println(newList);
    }

    private static List<String> vowelsToUpperCase(List<String> lines) {
        List<String> newList = new ArrayList<>();

        for (String s : lines) {
            StringBuilder sb = new StringBuilder();
            for (int index = 0; index < s.length(); index++) {
                char characterAtIndex = s.charAt(index);
                if (isVowel(characterAtIndex)) {
                    char upperCaseChar = Character.toUpperCase(characterAtIndex);
                    sb.append(upperCaseChar);
                }else{
                    sb.append(characterAtIndex);
                }
            }
            newList.add(sb.toString());
        }
        return newList;
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) > -1;
    }
}
