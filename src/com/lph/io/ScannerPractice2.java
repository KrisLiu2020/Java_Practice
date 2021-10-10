package com.lph.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/Kris/Desktop/BCIT_Term2_Sept" +
                "/HelloUniverse/ReadNumbersUsingScannerAndCalculate.txt");
        Scanner out = new Scanner(file);
        out.useDelimiter(",");
        int nextSum = 0;
        int counter = 0;
        while(out.hasNext()) {
            int i = Integer.parseInt(out.next());
//            System.out.println(Integer.parseInt(out.next()));
            System.out.println(i);
            nextSum += i;
            counter++;
        }
        System.out.println("Avg is: " + nextSum / counter);
    }
}
