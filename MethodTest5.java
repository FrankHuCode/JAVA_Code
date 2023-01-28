package com.itheima.param;

public class MethodTest5 {
    public static void main(String[] args) {
        //需求：判断2个数组是否相同，是返回true，反之返回false
        //3.定义2个数组
        int[] arr1={12,23,34};
        int[] arr2={12,23,34};
        System.out.println(compare(arr1, arr2));
    }
    //1.定义一个方法，参数：2个数组 返回值类型Boolean
    public static boolean compare(int[] arr1,int[] arr2){
        //2.2个数组之间长度，元素进行比较
        if(arr1.length==arr2.length){//先比较数组长度
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]!=arr2[i]){
                    return false;//发现一个不相等
                }
            }
            return true;//遍历一遍发现都相等
        }else {
            return false;
        }
    }
}
