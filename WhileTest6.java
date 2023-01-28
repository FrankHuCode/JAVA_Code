
package com.itheima.loop;

/**
    1.for循环和while循环的功能是一样的
    2.但是一开始不知道循环次数建议使用while循环
 */
public class WhileTest6 {
    public static void main(String[] args) {
        //需求：计算纸张需要折叠几次能够达到珠穆朗玛峰的高度
        //1.定义变量
        double peakHeight = 8848860.0;
        double paperThickness = 0.1;
        int count = 0;
        //2.使用while循环(不知道循环多少次使用while循环）控制纸张折叠
        while (paperThickness<=peakHeight){
            paperThickness*=2;
            count++;
        }
        System.out.println("纸张需要折叠"+count+"次能够达到珠穆朗玛峰的高度");
        System.out.println("纸张的厚度是："+paperThickness);
    }
}

