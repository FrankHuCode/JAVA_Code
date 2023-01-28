package com.itheima.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //目标：学会访问数组的元素
        int[] ages={18,19,17};

        //取值
        System.out.println(ages);//打印数组变量名的在内存中的地址
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        //赋值
        ages[2]=50;
        System.out.println(ages[2]);

        //获取数组的长度
        System.out.println(ages.length);

    }
}
