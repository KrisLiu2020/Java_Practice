package com.lph.leetcode;

import java.util.ArrayList;

public class Prime {

    public static ArrayList<Long> primes(final int upperBound) {
        ArrayList<Long> resultList = new ArrayList<>();
        for (int num = 1; num <= upperBound; num++) {
            int primeRecord = 0;
            for (int divisor = num; divisor >= 1; divisor--) {
                if (num % divisor == 0) {
                    primeRecord ++;
                }
            }
            if (primeRecord == 2) {
                resultList.add((long) num);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(primes(15));
    }
}
