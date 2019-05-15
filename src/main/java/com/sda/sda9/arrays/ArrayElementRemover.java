package com.sda.sda9.arrays;

import java.util.Arrays;

public class ArrayElementRemover {

    public static void main(String[] args) {
        int[] input = {0, 1, 2, 3, 4, 5, 5, 5, 6, 5, 5};
        String result = Arrays.toString(removeAll(input, 5));
        System.out.println(result);
    }

    static int[] removeAll(int[] array, int elementToRemove) {
        int newLength = array.length;
        for (int elem : array) {
            if (elementToRemove == elem) {
                newLength--;
            }
        }
        int[] result = new int[newLength];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                result[newIndex] = array[i];
                newIndex++;
            }
        }
        return result;
    }
}
