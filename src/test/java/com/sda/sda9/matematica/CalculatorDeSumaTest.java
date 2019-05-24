package com.sda.sda9.matematica;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorDeSumaTest {

    @Test
    public void testSuma(){
        int actual = CalculatorDeSuma.calculeazaSumaDeNrPozitive(2,3);
        int expected = 5;
//        String errorMessage = "The sum is wrong!!!";
//        Assert.assertEquals(errorMessage, expected, actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSumaNrNegativeTrebuieSaFieMinusUnu(){
        int actual = CalculatorDeSuma.calculeazaSumaDeNrPozitive(-2,7);
        int expected = -1;
        Assert.assertEquals(expected, actual);

    }


}
