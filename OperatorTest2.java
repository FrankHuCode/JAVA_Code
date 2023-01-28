package com.itheima.operator;

public class OperatorTest2 {
    public static void main(String[] args) {
        //需求：拆分一个3位数，并打印输出
        int data=589;
        //1.个位
        System.out.println(589%10);
        //2.十位
        System.out.println(589/10%10);
        //3.百位
        System.out.println(589/10/10%10);
        System.out.println(589/100);
    }
}
