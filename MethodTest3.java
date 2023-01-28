package com.itheima.param;

public class MethodTest3 {
    public static void main(String[] args) {
        //需求：使用方法形式打印数组的内容
        int[] ages = new int[]{18, 18, 19, 20, 48};
        printArray(ages);

        System.out.println("--------------------");

        int[] nubmers = new int[]{23, 23, 45, 67};
        printArray(nubmers);

        System.out.println("----------------");
        int[] numbers1 = {};
        printArray(numbers1);
    }

    public static void printArray(int[] arrs) {
        System.out.print("[");
        if (arrs != null && arrs.length > 0) {
            for (int i = 0; i < arrs.length; i++) {
            /*if(i==arrs.length-1){
                System.out.print(arrs[i]);
            }else{
            System.out.print(arrs[i]+",");
            }*/
                System.out.print(i == arrs.length - 1 ? arrs[i] : arrs[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
