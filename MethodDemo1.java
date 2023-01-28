package com.itheima.create;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标：学会创建方法以及理解方法的作用
        //方法：将一段代码实现的功能进行封装，可以重复调用
        //加法方法：
        //张工
        int c1=sum(10,20);
        System.out.println(c1);
        //徐工
        int c2=sum(20,30);
        System.out.println(c2);
    }
    public static int sum(int a,int b){
        return a+b;
    }
}

