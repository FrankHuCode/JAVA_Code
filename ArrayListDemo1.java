package com.itheima.studentlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 案例：学生信息系统：展示数据，并按照学号完成搜索
 * 学生类信息（学号，姓名，年龄，班级）
 * 测试数据：
 * "20180302","叶孤城",23,"护理一班"
 * "20180303","东方不败",24,"传智二班"
 * "20180304","西门吹雪",21,"中药学三班"
 * "20180305","梅超风",22,"外科一班"
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建一个学生类
        //2.创建一个学生集合用来存储数据
        Student student = new Student();//开始已经创建一个学生类，可以不用再定义，直接用就可以
        ArrayList<Student> studentArrayList = new ArrayList<>();

        //a.
        Student s1 = new Student("20180302", "叶孤城", 23, "护理一班");
        Student s2 = new Student("20180303", "东方不败", 24, "传智二班");
        Student s3 = new Student("20180304", "西门吹雪", 21, "中药学三班");
        Student s4 = new Student("20180305", "梅超风", 22, "外科一班");
        //b.
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);

        //ab.可以合成一步完成
        //studentArrayList.add(new Student("20180302","叶孤城",23,"护理一班"）);
        //studentArrayList.add(new Student("20180303","东方不败",24,"传智二班"）);
        //studentArrayList.add(new Student("20180304","西门吹雪",21,"中药学三班"）);
        //studentArrayList.add(new Student("20180305","梅超风",22,"外科一班"）);

        //3.展示学生信息
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t班级");
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student s = studentArrayList.get(i);
            System.out.println(s.getStuNumber() + "\t" + s.getName() + "\t" + s.getAge() + "\t\t" + s.getClassroom());
        }

        //4.根据学号查询学生信息
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入需要查询的学生学号：");
            String stu = sc.next();
            //5.调用方法得到学生对象的地址
            Student s=getStuNumberById(studentArrayList,stu);
            //6.判断s中的学生对象是否是查询对象
            if (s==null){
                System.out.println("对不起，查无此人！");
            }else {
                System.out.println("学号\t\t\t姓名\t\t年龄\t\t班级");
                System.out.println(s.getStuNumber() + "\t" + s.getName() + "\t" + s.getAge() + "\t\t" + s.getClassroom());
                break;
            }
        }
    }

    /**
     * 定义一个方法getStuNumberById():通过学号获取学生对象地址返回,返回类型：Student对象
     * @param students 存储学生的集合
     * @param StudyNumber 搜索的学生学号
     * @return 学生对象 | null
     */
    public static Student getStuNumberById(ArrayList<Student> students, String StudyNumber) {
        //1.遍历学生集合
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            if (s.getStuNumber().equals(StudyNumber)) {
                return students.get(i);
            }
        }
        return null;
    }
}
