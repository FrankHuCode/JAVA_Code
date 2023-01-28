package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //需求：键盘录入一组员工号，然后随机排序
        //1.定义一个动态初始化数组
        int[] codes=new int[5];

        //2.依次录入员工号
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            //正式录入员工号
            System.out.println("请输入第"+(i+1)+"个员工号：");
            int code=sc.nextInt();
            //将工号存到数组中
            codes[i]=code;
        }
        //3.遍历所有元素，随机生成一个索引，将该元素与索引的元素交换
        Random r=new Random();
        for (int i = 0; i < codes.length; i++) {
            int index=r.nextInt(codes.length);
            //定义一个临时变量保存index指向的值
            int temp=codes[index];
            codes[index]=codes[i];
            codes[i]=temp;
        }
        //4.遍历打印输出所有员工号
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i]+"\t");
        }
    }
}
