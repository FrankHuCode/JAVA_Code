package com.itheima.memory;

/**
 * 目标：两个变量指向同一个对象
 */
public class StudentTest1 {
    public static void main(String[] args) {
        //定义一个对象
        Student s1 =new Student();
        System.out.println(s1.name);
        System.out.println(s1.sex);
        System.out.println(s1.hobby);
        s1.Statement();
        System.out.println("-----------------------");
        //
        Student s2=s1;
        //2个变量指向同一个对象的地址
        System.out.println(s1);
        System.out.println(s2);
        s2.hobby="爱提问";

        System.out.println(s2.name);
        System.out.println(s2.sex);
        System.out.println(s1.hobby);
        s2.Statement();
    }
}
