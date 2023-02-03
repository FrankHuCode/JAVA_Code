package com.itheima.string;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //1.正确的登录名和密码
        String correctName="itheima";
        String correctPassword="123456";//字符串常量池，变量名指向常量池的地址

        //2.用户的登录名和密码
        Scanner sc=new Scanner(System.in);
        System.out.println("登录名：");
        String name=sc.next();
        System.out.println("密码：");
        String password= sc.next();//new出来的对象存在堆内存

        //3.判断用户的登录名和密码
        if(correctName.equals(name)&&correctPassword.equals(password)){
            //常量池的地址和堆内存的地址不一样，所以==这个判断是false
            System.out.println("登录成功~");
        }else {
            System.out.println("登录失败，登录名或者密码错误！");
        }
        System.out.println("--------------------------");
        //4.忽略大小写比较内容的Api:一般用于比较验证码的业务逻辑
        String sysCode="ab12gH";
        String code="AB12Gh";
        System.out.println(sysCode.equals(code));//false
        System.out.println(sysCode.equalsIgnoreCase(code));//true

    }
}
