package com.itheima.param;

public class MethodTest4 {
    public static void main(String[] args) {
        //需求：查找一个整数是否在数组中存在，若存在返回索引，不存在返回-1
        int[] arr={23,45,89,32,67};
        int index=searchIndex(arr,1);
        System.out.println("查找这个数的索引是："+index);

    }
    //1.定义一个方法，传入数组和要查找的整数，根据结果返回值
    public static int searchIndex(int[] arr,int data){
        //2.遍历整个数组，返回结果
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==data){
                return i;
            }
        }
        return -1;
    }
}
