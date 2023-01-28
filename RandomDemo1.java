package com.itheima.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //目标：学会使用Java提供的随机数类Random
        //1.导包
        //2.创建随机数对象
        Random r=new Random();//random()生成0~（n-1)之间的随机数
        //3.调用nextInt功能（方法）可以返回一个整型的随机数
        for (int i=0;i<5;i++) {
            int data=r.nextInt(10);//0~9（包前不包后）
            System.out.println(data);
        }
        System.out.println("---------------");
        //生成1~10:==>-1==>(0~9)+1 减加法
        for (int i=0;i<5;i++) {
            int a= r.nextInt(10)+1;
            System.out.println(a);
        }
        System.out.println("--------------");
        //生成3~17：==>-3==>(0~14)+3  减加法
        for (int i=0;i<5;i++) {
            int b= r.nextInt(15)+3;
            System.out.println(b);
        }
    }
}
