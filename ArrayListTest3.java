package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * 需求：遍历并删除元素值
 */
public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(98);
        list.add(77);
        list.add(66);
        list.add(89);
        list.add(79);
        list.add(50);
        list.add(100);
        System.out.println(list);

        /*for (int i = 0; i < list.size(); i++) {
            int score= list.get(i);
            if(score <80){
                list.remove(i);
                i--;
            }
        }*/
        for (int i = list.size()-1; i >=0 ; i--) {
            if(list.get(i)<80){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
