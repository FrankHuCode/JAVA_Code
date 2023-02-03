package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * 需求：影片信息在程序中的表示
 */
public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<Movie> listMovies=new ArrayList<>();

        Movie m1=new Movie("《长津湖》",9.9,"吴京");
        Movie m2=new Movie("《我和我的父亲》",9.0,"吴京");
        Movie m3=new Movie("《警察故事6》",9.8,"成龙");

        listMovies.add(m1);
        listMovies.add(m2);
        listMovies.add(m3);
        System.out.println(listMovies);//存放的是三个变量的地址

        for (int i = 0; i < listMovies.size(); i++) {
            Movie m=listMovies.get(i);
            System.out.println("电影名："+m.getName());
            System.out.println("评分："+m.getScore());
            System.out.println("主演："+m.getActor());
            System.out.println("----------------------");
        }

    }
}
