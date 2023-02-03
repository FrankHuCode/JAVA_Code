package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * 目标：创建ArrayList对象，代表集合容器，往里面添加元素
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建一个集合的对象
        ArrayList list=new ArrayList();

        //2.添加数据
        list.add("Java");
        list.add('a');
        list.add(12);
        list.add(false);
        list.add("黑马");
        list.add(23.7);
        System.out.println(list.add(23.7));//true
        System.out.println(list.add("赵敏"));//true

        System.out.println(list);

        //3.给指定位置插入元素
        list.add(1,"张无忌");
        System.out.println(list);
    }
}
