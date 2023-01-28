package com.itheima.param;

public class MethodDemo1 {
    //方法之间是平级关系，不能嵌套定义，可以嵌套调用
    public static void main(String[] args) {
        //目标：掌握基本类型方法的传递机制：值传递
        //值传递：传输的是实参存储的值
        //形参：方法定义时的变量
        //实参：方法内部自己定义的变量
        int a=10;//main方法内部自己定义并赋值
        change(a);
        System.out.println(a);//3.10：main方法自己内部的赋值
    }
    public static void change(int a){
        System.out.println(a);//1.10：main方法通过值传递过来的值
        a=20;//方法内部自己赋值
        System.out.println(a);//2.20：change方法内部自己的赋值
    }
}
