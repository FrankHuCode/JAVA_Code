package com.itheima.practise;

import java.util.Scanner;

public class PracticeDemo6 {
    public static void main(String[] args) {
        //需求：数字加密：1983 ==>+5 %10 反转==>8346
        //1.定义一个动态数组
        System.out.println("请您输入加密数字的个数：");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] numbers=new int[length];

        //2.把输入的数字密码存储到数组中
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("请您输入第"+(i+1)+"个数字");
            int number=sc.nextInt();
            numbers[i]=number;
        }
        //3.打印输出已存储的数字
        printArray(numbers);             //[1 9 8 3]

        //4.核心逻辑：将数组的元素按加密规则进行加密
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(numbers[i]+5)%10;//[6 4 3 8]
        }
        //5.核心逻辑：将数组进行反转             [8 3 4 6]
        for (int i = 0,j=numbers.length-1; i < j; i++,j--) {
            int temp=numbers[j];
            numbers[j]=numbers[i];
            numbers[i]=temp;
        }
        //6.打印输出加密后的数字
        printArray(numbers);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1?arr[i]:arr[i]+", ");
        }
        System.out.println("]");
    }
}
