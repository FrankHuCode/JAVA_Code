package com.itheima.demo;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // 目标：冒泡排序
        //需求：输入5个数字进行冒泡排序
        //1.定义动态初始化数组，存储输入的5个数字
        int[] datas = new int[5];
        //2.输入5个数字存入数组中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < datas.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字：");
            int number = sc.nextInt();
            //将数字依次存入数组
            datas[i] = number;
        }

        //3.遍历整个数组，并进行比较排序
        //外循环确定循环的轮数
        for (int i = 0; i < datas.length-1; i++) {
            //i=0 1 2 3         5-1=4
            //内循环确定循环次数
            for (int j = 0; j < datas.length - i - 1; j++) {
                //如果前面的数大于后面的数，就进行交换
                if (datas[j] > datas[j + 1]) {
                    int temp = datas[j + 1];
                    datas[j + 1] = datas[j];
                    datas[j] = temp;
                }
            }
        }
        for (int i = 0; i < datas.length; i++) {
            System.out.print(datas[i] + "\t");
        }
    }
}
