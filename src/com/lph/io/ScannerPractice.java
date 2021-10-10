package com.lph.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/Kris/Desktop/BCIT_Term2_Sept/HelloUniverse/WriteUsingPrintWriter.txt");
        Scanner fileScan = new Scanner(file);
        fileScan.useDelimiter("\s");
        while(fileScan.hasNext()) {
//            String line = fileScan.nextLine();
//            System.out.println(line);
            System.out.println(fileScan.next());
        }
    }
}
