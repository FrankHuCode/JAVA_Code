package com.itheima.student;

public class StudentObject {
    public static void main(String[] args) {

        //创建一个学生对象
        Stu s = new Stu();
        s.name = "张无忌";
        s.age = 19;
        s.score = 98.5;
        s.exam();
        s.study();
        System.out.println("------------------");

        Stu s1=new Stu();
        s.name="赵敏";
        s.age=20;
        s.score=90;
        s.exam();
        s.study();

    }
}
