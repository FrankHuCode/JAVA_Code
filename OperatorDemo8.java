package com.itheima.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        //目标：学会使用三元运算符，理解其流程
        //表达式1？表达式2：表达式3；
        double score=98;
        String rs=score>=60?"考试通过":"挂科";
        System.out.println(rs);

        //需求：需要从2个整数中找出最大值
        int a=1000;
        int b=10;
        int max=a>b?a:b;
        System.out.println(max);

        System.out.println("---------------");
        //demo:求三个数中的最大值
        int i=10;
        int j=20;
        int k=19;
        int temp=i>j?i:j;
        int rsMax=temp>k?temp:k;
        System.out.println(rsMax);
        System.out.println("---------扩展---------");

        int rsMax1=i>j?(i>k?i:k):(j>k?j:k);
        System.out.println(rsMax1);

    }
}
