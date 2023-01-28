package com.itheima.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        //1.类型转换的结果由最高类型决定
        byte a=10;
        int b=20;
        double c=1.0;
        double rs=a+b+c;
        System.out.println(rs);

        double rs2=a+b-2.3;
        //目标：掌握表达式的自动转换规则
        System.out.println(rs2);

        //2.byte、short、char类型直接转换成int类型运算的
        byte i=1;
        byte j=2;
        int k=i+j;
        System.out.println(k);
    }
}
