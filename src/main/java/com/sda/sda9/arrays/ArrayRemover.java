package com.sda.sda9.arrays;

import java.util.Arrays;

public class ArrayRemover {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 6, 3, 4, 5, 6};
        System.out.println(Arrays.toString(removeFirst(arr, 6)));
        System.out.println(Arrays.toString(removeAll(arr, 6)));
    }

    private static int[] removeAll(int[] arr, int t) {
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                arr[i] = -10;
                length--;
            }
        }
        int index = 0;
        int[] result = new int[length];
        for (int value : arr) {
            if (value != -10) {
                result[index] = value;
                index++;
            }
        }
        return result;
    }

    static int[] removeFirst(int[] arr, int t) {
        int[] result = new int[arr.length - 1];
        int index = 0;
        boolean found = false;
        for (int value : arr) {
            if (value == t && !found) {
                found = true;
                continue;
            } else {
                result[index] = value;
                index++;
            }

        }
        return result;
    }


}
