package com.sda.sda9.stringuri;

public class VowelCounter {

    static int count(String s) {
        int counter = 0;
        char[] charArray = transform(s);
        for (char c : charArray) {
            if (isVowel(c)) {
                counter++;
            }
        }
        return counter;
    }
    static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
       return vowels.indexOf(c)!=-1;
    }

    static char[] transform(String input) {
        return input.toCharArray();
    }
}
