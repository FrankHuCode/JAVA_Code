package com.itheima.string;

import java.util.Scanner;

/**
 * 目标：三次机会验证登录是否成功
 */
public class StringTest5 {
    public static void main(String[] args) {
        //1.定义系统正确的登录名和密码
        String correctName="admin";
        String correctPassword="itheima";

        //2.定义一个循环，让用户登录
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入您的登录名：");
            String loginName=sc.next();
            System.out.println("请输入您的密码：");
            String loginPassword= sc.next();

            //3.判断用户输入的信息与系统的信息比对
            if(correctName.equals(loginName)){
              if (correctPassword.equals(loginPassword)){
                  System.out.println("登录成功！");
              }else{
                  System.out.println("您输入的密码有误，还有"+(3-i)+"次机会~~");
              }
            }else {
                System.out.println("您输入的登录名有误，还有"+(3-i)+"次机会登录~~");
            }

        }
    }
}
