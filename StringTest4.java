package com.itheima.string;

import java.util.Random;

/**
 * 案例：使用String完成随机生成5位验证码
 */
public class StringTest4 {
    public static void main(String[] args) {
        //1.定义字符串包含小写字母、大写字母、数字0~9
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUWVXYZ0123456789";

        //2.循环5次，随机生成5个索引，提取索引所对应的字符，连接起来即可
        String code="";
        Random r=new Random();
        for (int i = 0; i < 5; i++) {
            int index=r.nextInt(str.length());
                char c=str.charAt(index);
                code+=c;
        }
        System.out.println(code);
    }
}
