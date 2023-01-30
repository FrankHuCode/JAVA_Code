package com.itheima.practise;

import java.util.Random;

public class PracticeDemo3 {
    public static void main(String[] args) {
        //需求：开发验证码，验证码包含：大写字母，小写字母，数字
        String code=createStr(5);
        System.out.println("随机生成的验证码："+code);
    }
    //1.定义一个方法：返回类型String 参数类型 int
    public static String createStr(int n){
        //2.先定义一个空字符串
        String code="";
        Random r=new Random();
        //3.定义一个循环
        for (int i = 0; i < n; i++) {
            int type=r.nextInt(3);//0 1 2 = 大写字母 小写字母 数字
            switch (type){
                case 0:
                    //'A'=65 'Z'=25+65;
                    char ch=(char)(r.nextInt(26)+65);
                    code+=ch;
                    break;
                case 1:
                    //'a'=97 'z'=25+97;
                    char ch1=(char)(r.nextInt(26)+97);
                    code+=ch1;
                    break;
                case 2:
                    /*char ch2=(char)(r.nextInt(10)+48);
                    code+=ch2;*/
                    code+=r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
