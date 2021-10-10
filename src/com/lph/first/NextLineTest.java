package com.lph.first;

import java.util.Scanner;

public class NextLineTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//declare, not for input yet
        System.out.println("Type sth here: ");
        String userMsg = scanner.next();  // 输入"我爱学JAVA"
        String userMsg2 = scanner.nextLine();
//        String userMsg3 = scanner.nextLine(); //Solution(1/2)
        System.out.println(userMsg);
        System.out.println(userMsg2);
//        System.out.println(userMsg3);//Solution(2/2): add one more line of code to keep reading after an empty line
        scanner.close();
    }
}

//nextLine吸取字符前后的空格/Tab键，回车键截止
//next不会吸取字符前/后的空格/Tab键，只吸取字符

//通俗解释为：因为next()读取到空白符前的数据时结束了，然后把回车“\r”留给了nextLine();
//所以上面nextLine()没有输出,不输出不代表没数据，是接到了空（回车“/r”）的数据。
//https://bbs.huaweicloud.com/blogs/203723