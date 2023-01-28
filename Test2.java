package com.itheima.demo;

public class Test2 {
    public static void main(String[] args) {
        //需求：数组元素最大值
        //1.定义一个静态初始化数组，用来存储颜值
        int[] faceScores={15,9000,10000,20000,9500,-5};
        //2.定义一个变量，用于存储较大值，建议使用数组第一个元素作为初始值
        int max=faceScores[0];
        //3.遍历整个数组，并与最大值进行比较，若大于，便赋值
        for (int i = 1; i < faceScores.length; i++) {
            //判断大小
            if(faceScores[i]>max){
                max=faceScores[i];
            }
        }
        //4.输出最大值
        System.out.println("颜值最高的是："+max);

    }
}
