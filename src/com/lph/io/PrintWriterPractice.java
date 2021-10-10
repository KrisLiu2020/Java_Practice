package com.lph.io;

import java.io.*;
import java.util.Scanner;

public class PrintWriterPractice {

    public static void main(String[] args) throws IOException {
        File file = new File("WriteUsingPrintWriter.txt");
        PrintWriter out = new PrintWriter(file, "UTF-8");
        out.println("Hello There!\n");
        out.println("I am using PrintWriter to write!\n");
        out.close();

    }
}
