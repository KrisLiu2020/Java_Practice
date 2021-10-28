package com.lph.generics;

public class WarmUp {

    public static int getSumOfTwoLargest(int[] arrayOfIntegers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        if (arrayOfIntegers.length < 2) {
            System.out.println("Array length must be at least 2.");
            return -1;
        }
        for (int arrayOfInteger : arrayOfIntegers) {
            if (arrayOfInteger > max) {
                secondMax = max;
                max = arrayOfInteger;
            } else if (arrayOfInteger > secondMax) {
                secondMax = arrayOfInteger;
            }
        }
        return max + secondMax;
    }

    public static void main(String[] args) {
        int[] testArr1 = {2, 1};
        int[] testArr2 = {2, 4, 6, 8, 10, 12, 14};
        int[] testArr3 = {14, 12, 10, 8, 10, 12, 14};
        int[] testArr4 = {8, 8, 8, 8, 8, 8, 8};

        System.out.println("expected: 3\n" + getSumOfTwoLargest(testArr1));
        System.out.println("expected: 26\n" + getSumOfTwoLargest(testArr2));
        System.out.println("expected: 28\n" + getSumOfTwoLargest(testArr3));
        System.out.println("expected: 16\n" + getSumOfTwoLargest(testArr4));
    }
}
