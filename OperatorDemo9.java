package com.itheima.operator;

public class OperatorDemo9 {
    public static void main(String[] args) {
        //目标：学会判断运算的优先级
        System.out.println(10 > 3 || 10 > 3 && 10 < 3);
        System.out.println((10 > 3 || 10 > 3) && 10 < 3);
    }
}
