package com.lph.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPractice {

    public static void main(String[] args) throws IOException {

        // 1. 实例化File类的对象，指明要操作的文件（source data）
        File file = new File("HelloWorldRead.txt");
//        System.out.println(file.getAbsolutePath());
        // 2. 提供具体的流(管道)
        FileReader fr = new FileReader(file);
        // 3. 数据的读入:
        // read(): return the character read, or -1 if the end of the stream has been reached; int as in ASCII
        //方式一：
//        int data = fr.read();
//        while(data != -1) {
//            System.out.print((char)data);
//            //read one more time, aka, next char
//            data = fr.read();
//        }
        //方式二：语法修改
        int data;
        while((data = fr.read()) != -1) {
            System.out.print((char)data);
        }
        // 4. 流的关闭操作
        fr.close();

        //因为throw异常并不是一种好的处理方法，最好使用try-catch-finally
        //try自动生成：Menu-Code-Surround with;

    }

}
