package com.itheima.operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
        //目标：学会使用逻辑运算符,并能够选择合适的逻辑运算符解决问题
        //& | ! ^ 与 或 非（取反） 异或（相同为假，不同为真）
        System.out.println(true^false);
        System.out.println(false^true);
        System.out.println(true^true);
        System.out.println(false^false);

        System.out.println("-----------------");
        //短路逻辑运算符
        //&& ||
        //判断结果与”&“一样，过程是左边为false，右边则不执行
        //判断结果与”|“一样，过程是左边为true，右边则不执行
        //注意：”&“和”|“：无论左边的结果如何，两边都要执行
        int a=20;
        int b=20;
        System.out.println(a>100 && b++>10);
        System.out.println(b);
        System.out.println(a>100 & b++>10);
        System.out.println(b);

    }
}
