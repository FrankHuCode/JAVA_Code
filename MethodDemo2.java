package com.itheima.create;

public class MethodDemo2 {
    public static void main(String[] args) {
        //目标：学会方法的定义形式及其调用方式，并理解执行流程
        int c1=add(10,20);
        System.out.println("加法求和是："+c1);

        int c2=add(30,48);
        System.out.println("加法求和是："+c2);
    }
    public static int add(int a,int b){
        return a+b;
    }
}
