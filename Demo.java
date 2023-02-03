package com.itheima.movie;

/**
 * "《长津湖》",9.9,50.0,"吴京"
 * "《我和我的父亲》",9.0,40.0,"吴京"
 * "《警察故事5》",9.8,55.0,"成龙"
 *
 */
public class Demo {
    public static void main(String[] args) {
        //1.创建一个电影对象
        //2.定义一个动态数组保存电影
        Movie[] movies=new Movie[100];
        //3.将电影信息存入数组中
        movies[0]=new Movie("《长津湖》",9.9,50.0,"吴京");
        movies[1]=new Movie("《我和我的父亲》",9.0,40.0,"吴京");
        movies[2]=new Movie("《警察故事5》",9.8,55.0,"成龙");
        //4.将电影信息展示出来

        for (int i = 0; i < movies.length; i++) {
            Movie m=movies[i];
            if(m!=null){
                System.out.println("电影："+m.getName());
                System.out.println("评分："+m.getScore());
                System.out.println("价格：$"+m.getPrice());
                System.out.println("主演："+m.getActor());
                System.out.println("-----------------------");
            }else {
                break;
            }
        }
    }
}
