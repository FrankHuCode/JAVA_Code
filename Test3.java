package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //需求：猜数字游戏
        //1.建一个动态初始化数组，保存随机生成的5个数
        int[] randNumber=new int[5];
        //2.将生成的随机数放入动态数组中
        Random r=new Random();
        for (int i = 0; i < randNumber.length; i++) {
            randNumber[i]=r.nextInt(1,20);
        }
        //3.定义一个死循环，让用户进行猜测
        Scanner sc=new Scanner(System.in);
        OUT:
        while(true){
            System.out.println("请输入您的数字：");
            int guessNumber=sc.nextInt();

            //4.将用户的数据与数组的元素一一比较，根据结果给出相关提示
            for (int i = 0; i < randNumber.length; i++) {
                //判断用户的数字与数组元素是否相同
                if(guessNumber==randNumber[i]){
                    System.out.println("恭喜您，猜中了！这个数字的索引是"+i);
                    break OUT;
                }
            }
            System.out.println("当前数组中没有您猜的数字，请重新猜数字");
        }
        //5.打印输出数组内的数字
        for (int i = 0; i < randNumber.length; i++) {
            System.out.print(randNumber[i]+"\t");
        }
    }
}
