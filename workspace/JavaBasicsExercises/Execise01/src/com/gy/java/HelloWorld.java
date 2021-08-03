package com.gy.java;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld!");
        //输入输出语句练习
        System.out.println("输入一个数字：");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println(num1);
    }
}
