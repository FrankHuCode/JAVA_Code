package com.itheima.string;

/**
 * 目标：学会String的2种定义方式
 */
public class StringDemo1 {
    public static void main(String[] args) {
        //方式1：直接使用双引号得到字符串对象
        String name="我爱你中国";
        System.out.println(name);

        //方式2：
        //1，public String()：创建一个空白字符串对象，不含有内容。
        String s1=new String();//s1=""
        System.out.println(s1);

        //2.public String(String):根据传入的字符串内容，来创建字符串对象
        String s2=new String("我是中国人");
        System.out.println(s2);

        //3.public String(char[] c):根据字符数组的内容，来创建字符串对象
        char[] chars={'a','b','中','国'};
        String s3=new String(chars);
        System.out.println(s3);

        //4.public String(byte[] b):根据字节数组的内容，来创建字符串对象
        byte[] bytes={97,98,99,65,66,67};
        String s4=new String(bytes);
        System.out.println(s4);
        System.out.println("--------------------------");

        String s5="abc";
        String s6="abc";//这里是用方式1来创建字符串对象，存于字符串常量池中
        System.out.println(s5==s6);//true
        System.out.println("----");

        char[] chars1={'a','b','c'};
        String s7=new String(chars1);//new出来的字符串对象指向不同的地址
        String s8=new String(chars1);//这里是用方式2来创建字符串对象，存于堆内存中
        System.out.println(s7==s8);//s7!=s8 false



    }
}
