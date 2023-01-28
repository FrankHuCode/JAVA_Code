package com.itheima.demo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //需求：输入一个整数，判断该整数是奇数还是偶数，输出提示，使用方法完成
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入一个整数：");
            int n=sc.nextInt();
            if(n>=0) {
                check(n);
            }else {
                System.out.println("输入的数不是整数，已退出");
                break;
            }
        }
    }
    public static void check(int n){
        //判断输入的数是奇数还是偶数
        if(n%2==0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
}
