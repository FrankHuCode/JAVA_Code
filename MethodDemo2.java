package com.itheima.param;

public class MethodDemo2 {
    public static void main(String[] args) {
        //目标：掌握引用类型方法的传递机制：地址传递，注意区别值传递
        //地址传递：传输的是变量名的地址
        int[] arrs=new int[]{12,23,45,76};
        change(arrs);
        System.out.println(arrs[1]);//3.222 change方法传递过来的
    }
    public static void change(int[] arrs){
        System.out.println(arrs[1]);//1.23 main方法传递过来的
        arrs[1]=222;
        System.out.println(arrs[1]);//2.222 change方法内部的
    }
}
