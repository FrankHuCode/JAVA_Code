package com.itheima.thisdemo;

public class Car {
    String name;
    double price;

    /**
     * 无参数构造器
     */
    public Car(){
        System.out.println("无参构造器的this："+this);
    }

    /**
     * 有参数构造器
     */
    public Car(String name,double price){
        this.name=name;
        this.price=price;
    }
    //run方法
    public void run(){//无参数
        System.out.println("方法中的this:"+this);
        System.out.println(name+"正在和"+name+"比赛~~");//无参构造器默认初始值
    }
    //goMatch方法
    public void goMatch(String name){//有参数
        System.out.println(this.name+"正在和"+name+"比赛~~");//this.name指的是c2中原有的赋值初始化的对象，name指的是调用goMatch方法时的赋值
    }
}

