package com.itheima.scanner;

import java.util.Scanner;

//1.导包（导包其实不需要自己手写，可以通过工具直接导入）
//import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        //目标：学会使用键盘录入技术
        //2.得到一个键盘扫描器对象
        Scanner sc=new Scanner(System.in);

        //3.调用sc对象的功能等待接收用户输入的信息
        //这个代码等待用户输入数据并按回车键
        System.out.println("请输入您的年龄：");
        int age=sc.nextInt();
        System.out.println("您的年龄是："+ age);

        System.out.println("请输入您的名字：");
        String name=sc.next();
        System.out.println("欢迎："+name);
    }
}
