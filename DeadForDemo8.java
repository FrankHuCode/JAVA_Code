package com.itheima.loop;

import java.util.Scanner;

public class DeadForDemo8 {
    public static void main(String[] args) {
        //目标：学会定义无限循环
        /*for (; ;) {
            System.out.println("HelloWorld");
        }*/

        //经典写法
        /*while(true){
            System.out.println("我是幸福的死循环----");
        }*/

        //do...while
        /*do{
            System.out.println("我是幸福的死循环----");
        }while (true);*/
        System.out.println("-------------");
        //1.定义正确的系统密码
        int okpassword=520;
        //2.定义一个死循环判断用户输入的密码是否正确

        while(true){
            System.out.println("请输入您的密码：");
            Scanner sc=new Scanner(System.in);
            int password=sc.nextInt();
            //3.使用if语句判断密码是否正确
            if(password==okpassword){
                System.out.println("登录成功了！");
                break;
            }else {
                System.out.println("密码错误，请重新输入！");
            }
        }
    }
}
