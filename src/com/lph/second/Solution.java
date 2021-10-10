package com.lph.second;

public class Solution {

    public static boolean findSum (int sum, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int diff = sum - i;
            for (int j = 1; j < arr.length; j ++) {
                if (j == diff) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int sum = 5;
        int[] testArray = {1, 3, 2, 0, 9};
        System.out.println("result" + findSum(sum, testArray));
    }


}
