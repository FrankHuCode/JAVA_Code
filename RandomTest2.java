package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        //1.生成一个1~100幸运号码
        Random r=new Random();
        int luckyNumber=r.nextInt(100)+1;

        //2.使用一个死循环判断用户的号码，并给出提示
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请您输入猜测的号码（1~100）：");
            int guessNumber= sc.nextInt();

            //3.if语句判断
            if(guessNumber>luckyNumber){
                System.out.println("您猜测的号码过大了");
            } else if (guessNumber<luckyNumber) {
                System.out.println("您猜测的号码过小了");
            }else{
                System.out.println("恭喜您，猜中了，可以去买单了--");
                break;//直接跳出并结束死循环
            }
        }
    }
}
