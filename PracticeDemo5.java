package com.itheima.practise;

import java.util.Scanner;

public class PracticeDemo5 {
    public static void main(String[] args) {
        //需求：评委打分，去掉一个最高分，去掉一个最低分，平均得分

        //1.定义一个动态数组存储输入的分数
        int[] scores=new int[6];

        //2.依次输入评委评分
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请您输入第"+(i+1)+"位评委的评分：");
            int score=sc.nextInt();
            scores[i]=score;
        }
        //3.定义一个循环分别计算出最大值、最小值、总分
        int max=scores[0];
        int min=scores[0];
        int sum=0;
        for (int i = 0; i < scores.length; i++) {
            //替换最大值变量的值
            if(scores[i]>max){
                max=scores[i];
            }
            //替换最小值变量的值
            if(scores[i]<min){
                min=scores[i];
            }
            //求出总分
            sum+=scores[i];
        }
        //4.求出最终得分
        double result=(sum-max-min)*1.0/(scores.length-2);
        System.out.println("选手的最终得分是："+result);
    }
}
