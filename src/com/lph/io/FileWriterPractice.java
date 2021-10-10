package com.lph.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPractice {

    public static void main(String[] args) throws IOException {
        File file = new File("HelloWorldWrite.txt");
        FileWriter fw = new FileWriter(file);
        // If file does not exist, a new file will be created in the highest level of folder by default
        // If file already exists, it will overwrite the existing file.
        fw.write("This is a practice for writing into a file.\n");
        fw.write("It is actually not that hard.");
        fw.close();
    }

}
