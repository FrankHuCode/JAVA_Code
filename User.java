package com.itheima.javabean;

public class User {
    //成员变量使用private修饰
    private String name;
    private double salary;
    private int age;
    private double height;

    //3.必须提供一个无参构造器，如果写了有参构造器，还需要自己写一个无参构造器

    public User() {
    }

    public User(String name, double salary, int age, double height) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.height = height;
    }


    //2.必须为成员变量提供成套的setter和getter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
