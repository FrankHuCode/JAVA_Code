package com.itheima.loop;

/**
    总结：A.三种循环的区别
        1.for循环和while循环（先判断后执行）
        2.do...while（第一次先执行后判断）
        B.for和while的区别：
        1.for循环和while循环的执行流程是一样的
        2.如果已知循环次数建议使用for循环，如果不知道要循环的次数建议使用while循环
        3.for循环中，控制循环的变量只在循环中可以使用，while循环中，控制循环的变量在循环后还可以继续使用

 */
public class DoWhileDemo7 {
    public static void main(String[] args) {
        //目标：学会使用do...while..循环，并理解它的执行流程
        int i=0;
        do{
            System.out.println("HelloWorld");
            i++;
        }while(i<3);
    }
}
