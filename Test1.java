package com.itheima.thisdemo;

/**
 * 目标：理解this关键字的作用
 * a.可以用于指定访问当前对象的成员变量，成员方法
 *
 * 1.this出现在有参数构造器中的用法
 * 2.this出现在成员方法中的用法
 */
public class Test1 {
    public static void main(String[] args) {
        //创建汽车对象
        Car c = new Car();

        System.out.println("创建对象的地址"+c);

        c.run();

        System.out.println("===============");

        Car c2 = new Car("奔驰", 39.9);
        System.out.println(c2.name);
        System.out.println(c2.price);
        System.out.println("---------------------");

        c2.goMatch("宝马");

    }
}