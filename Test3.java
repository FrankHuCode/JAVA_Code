package com.itheima.demo;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //需求：使用方法，支持找到任意整型数组的最大值并输出
        //输入10个数字，输出最大值
        int[] ages=new int[10];

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入10个整数：");

        for (int i = 0; i < ages.length; i++) {
            ages[i]=sc.nextInt();
        }
        int max=getArrayMaxValue(ages);
        System.out.println("数组内的最大值是："+max);

    }
    public static int getArrayMaxValue(int[] arr){
        //找出最大值返回结果
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
