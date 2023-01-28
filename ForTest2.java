package com.itheima.loop;

public class ForTest2 {
    public static void main(String[] args) {
        //需求：求1~5之间的数据和，并把求和结果在控制台输出
        //2.定义一个整型变量用于累加数据求和
        int sum=0;
        //1.定义一个for循环
        for (int i = 1; i <=5 ; i++) {
            //i=1 2 3 4 5
            //3.把循环的数据累加给sum变量
            sum+=i;
        }
        System.out.println("1~5之间的和是："+sum);
    }
}
