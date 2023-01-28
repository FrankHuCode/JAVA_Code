package com.itheima.demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //需求：求1~n的和，并返回结果
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入求和的数：");
            int n = sc.nextInt();
            System.out.println(sum(n));
            if(n<0){
                System.out.println("退出");
                break;
            }
        }
    }
    public static int sum(int n) {
        int sum = 0;
        if(n<0){
            return -1;
        }else{
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
