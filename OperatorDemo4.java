package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //目标：学会使用自增自减运算符 ++ --前缀、后缀
        //++ -- 只能用于变量的操作，不能用于字面量的操作

        int a=10;
        ++a;
        System.out.println(a);

        int b=10;
        System.out.println(b);

        System.out.println("-------------------");
        //在表达式中或者不是单独操作的情况 ++ -- 在变量的前后存在区别
        //前缀++ --
        //先计算后使用
        //后缀++ --
        //先使用后计算
    }
}
