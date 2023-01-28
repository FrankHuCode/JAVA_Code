package com.itheima.loop;

public class BreakAndContinueDemo10 {
    public static void main(String[] args) {
        //目标：理解break和continue的作用
        //break：跳出并结束当前所在循环的执行
        //continue：用于跳出当前循环的档次执行，进入下一次循环
        //注意：break：只能用于结束所在循环，或者结束所在switch分支的执行，不能用于if语句
        //  continue：只能在循环中进行使用

        //continue:
        for (int i = 1; i <= 5; i++) {
            if (i==3){
                //跳出i==3的执行，到下一次循环
                continue;
            }
            System.out.println("洗碗"+i);//当i==3时，这条语句不执行
        }
    }
}
