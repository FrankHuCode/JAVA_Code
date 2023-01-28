package com.itheima.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        //学习自动类型转换
        //类型范围小的变量，可以直接赋值给类型范围大的变量
        //byte<short(char)<int<long<float<double
        byte a=20;
        int b=a;//自动类型转换
        System.out.println(b);

        int age=23;
        double db=age;//自动类型转换
        System.out.println(db);

        char ch='a';
        int code=ch;//自动类型转换
        System.out.println(code);
    }
}
