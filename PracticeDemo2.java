package com.itheima.practise;

public class PracticeDemo2 {
    public static void main(String[] args) {
        //需求：找出100~200之间的素数，并打印输出
        //1.遍历100~200之间的数
        System.out.println("100~200之间的素数是：");
        for (int i = 100; i <=200 ; i++) {
            //信号位：标识
            boolean flag=true;//设置一个标识,假设一开始这个数就是素数
            //
            //2.判断这个数是否为素数
            for (int j = 2; j <i/2 ; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            //3.根据判断结果是否为素数，若是就输出
            if(flag){
                System.out.print(i+"\t");
            }
        }
    }
}
