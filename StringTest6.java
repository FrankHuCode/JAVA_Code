package com.itheima.string;

import java.util.Scanner;

/**
 * 需求：手机号码屏蔽
 */
public class StringTest6 {
    public static void main(String[] args) {
        //1.键盘输入一个电话号码
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的手机号码：");
        String tel= sc.next();

        //2.截取电话号码前三位和后四位
        String s1 = tel.substring(0, 3);
        String s2 = tel.substring(7);
        //System.out.println(s1);
        //System.out.println(s2);
        System.out.println(s1+"****"+s2);
    }
}
