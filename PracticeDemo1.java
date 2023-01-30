package com.itheima.practise;

import java.util.Scanner;

public class PracticeDemo1 {
    public static void main(String[] args) {
        //需求：根据用户输入的信息，输出买飞机票的价格
        //1.提示用户输入信息
        Scanner sc = new Scanner(System.in);
        //飞机票原价
        System.out.println("请您输入飞机票原价：");
        double price = sc.nextDouble();
        //出行月份
        System.out.println("请您输入月份数（1~12）；");
        int month = sc.nextInt();
        //舱位
        System.out.println("请您选择舱位：");
        String str = sc.next();
        //4.调用方法，输出结果
        double money=buyTicket(price,month,str);
        System.out.println("您购买的飞机票价格是："+money+"元。");
    }

    //2.定义一个方法：参数：价格、月份、舱位 返回值：价格
    public static double buyTicket(double price, int month, String str) {
        //3.判断用户输入的信息
        //根据月份判断
        if (month >= 5 && month <= 10) {
            //旺季
            //根据舱位判断
            switch (str) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
                default:
                    price=-1;
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
            //淡季
            //根据舱位判断
            switch (str) {
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
                default:
                    price=-1;
            }
        } else {
            System.out.println("您输入的月份有问题~~~");
            price=-1;
        }
        return price;
    }
}
