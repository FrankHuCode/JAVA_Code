package com.itheima.array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //目标：学会动态初始化数组的定义和使用
        double[] scores=new double[10];

        //赋值
        scores[0]=99.8;
        System.out.println(scores[0]);
        System.out.println(scores[2]);

        //System.out.println(scores[10]);//越界访问
        //
        String[] names=new String[90];
        names[0]="西门吹雪";
        names[3]="独孤求败";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
