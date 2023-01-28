package com.itheima.traverse;

public class ArrayTest2 {
    public static void main(String[] args) {
        //需求：求销售部门的销售总额
        //0.使用静态数组存储数据
        int[] arr = {6, 12, 200, 45, 23};
        //2.定义一个变量存储累加值
        int sum = 0;
        //1.遍历数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        //3.打印输出累加变量
        System.out.println("销售部门的销售额是："+sum);
    }
}
