package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * 目标：掌握常用的ArrayList的API
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<>();
        list.add(0,"张无忌");
        list.add(1,"乾坤大挪移");
        list.add(2,"张敏");
        list.add(23);//自动添加到list末尾
        list.add(3,"殷素素");
        list.add(4,"张五侠");
        System.out.println(list);


        //1.public E get(int index):获取某个索引位置处的元素值
        System.out.println("______获取某位置的元素______");
        System.out.println(list.get(3));
        System.out.println(list.get(0));
        System.out.println("----------打印整个集合--------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //2.public int size():获取集合的大小（元素个数）
        System.out.println("---------获取集合的元素个数-------");
        int length= list.size();
        System.out.println(length);
        //3.完成集合的遍历
        System.out.println("--------完成集合的遍历---------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //4.public E remove(int index):删除某个索引位置处的元素值，
        //               并返回被删除的元素值
        System.out.println("------删除元素返回被删的元素-----");
        System.out.println(list.remove(2));
        System.out.println(list);

        //5.public boolean remove(Object o):直接删除元素值，删除成功返回true，删除失败返回false
        System.out.println("---直接删除元素值---");
        System.out.println(list.remove((Integer)23));
        System.out.println(list);
        //6.public E set(int index,E element):修改某个索引位置处的元素值
        System.out.println("---修改索引的元素值---");
        System.out.println(list.set(3, "小昭"));//返回被修改的元素值
        System.out.println(list);

    }
}
