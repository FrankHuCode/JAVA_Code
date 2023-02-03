package com.itheima.object;

public class CreateObject {
    public static void main(String[] args) {
        //目标：设计类-->创建对象--->使用对象（访问）
        Car c=new Car();//创建了一个对象，第1个Car表示已经设计好的一个类型（汽车）所以要先设计类
        c.name="红旗";
        c.price=50.8;
        System.out.println(c.name);//不赋值是默认值
        System.out.println(c.price);
        c.start();
        c.run();

    }
}
