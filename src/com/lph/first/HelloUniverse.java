package com.lph.first;

public class HelloUniverse {
    public static void main(final String[] args) {
        final String msg = "Hello Universe";
        System.out.println(msg);

        int num1 = 50;
        int result = num1 / 6;

        int num2 = 50;
        double result2 = num2 / 6;  // 先得到整数结果，再将结果转换成double型

        int num3 = 50;
        double result3 = (double)num3 / 6;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
