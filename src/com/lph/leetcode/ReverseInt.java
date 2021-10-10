package com.lph.leetcode;

import java.util.ArrayList;

public class ReverseInt {

    public static int reverseInt(int x){
        int remain = x;
        int bit;
        ArrayList<Integer> container1 = new ArrayList<>();
        ArrayList<Integer> container2 = new ArrayList<>();
        String numString = Integer.toString(x);
        int numStringLength = numString.length();
        System.out.println(numStringLength);
        while(container1.size() != numStringLength) {
            bit = remain % 10;//3
            remain = remain / 10;//12
            container1.add(bit);//3,
            container2.add(remain);
            System.out.println(container1);
            System.out.println(container2);
        }
        return 0;
    }

    public static void main(String[] args) {
        reverseInt(123);
    }
}
