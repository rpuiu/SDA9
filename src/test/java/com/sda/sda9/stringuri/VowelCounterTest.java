package com.sda.sda9.stringuri;

import org.junit.Assert;
import org.junit.Test;


public class VowelCounterTest {

    @Test
    public void testCharArrayFromString() {
        String inputString = "String de iasdadfsrdgfknryj";
        char[] transformedString = VowelCounter.transform(inputString);
        char expected = 'S';
        char actual = transformedString[0];
        Assert.assertEquals(expected, actual);

        Assert.assertNotEquals('s', actual);

        char actualLastChar = transformedString[transformedString.length - 1];
        Assert.assertEquals('j', actualLastChar);
    }

    @Test
    public void test() {
        Assert.assertEquals('S', VowelCounter.transform("String de iasdadfsrdgfknryj")[0]);
    }

    @Test
    public void testCounter() {
        String inputString = "Un String cu vocale";
        int actual = VowelCounter.count(inputString);
        int expected = 6;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIsVowel(){
        char a = 'a';
        Assert.assertTrue(VowelCounter.isVowel(a));
        char z = 'z';
        Assert.assertFalse(VowelCounter.isVowel(z));
    }
}
