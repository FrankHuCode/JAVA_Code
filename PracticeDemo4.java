package com.itheima.practise;

public class PracticeDemo4 {
    public static void main(String[] args) {
        //需求：数组元素的复制
        //定义2个整型数组：静态数组初始化，动态数组初始化
        int[] arr1 = {11, 22, 33, 44};
        int[] arr2 = new int[arr1.length];

        //分别调用2个方法并打印输出
        copyArray(arr1, arr2);
        printArray(arr1);
        printArray(arr2);
    }
    //完成打印数组元素
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");

        }
        System.out.println("]");
    }
    //完成数组arr1的元素复制到数组arr2中
    public static void copyArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
}
