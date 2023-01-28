package com.itheima.loop;

public class ForTest4 {
    public static void main(String[] args) {
        //需求：求三位数的水仙花数并输出
        int count=0;
        //1.定义一个for循环找到100~999
        for (int i = 100; i <=999 ; i++) {
            //i=100 101...999

            //2.判断这个数是否满足需求
            //个位
            int onesDigit=i%10;
            //十位
            int tensDigit=i/10%10;
            //百位
            int hundredsDigit=i/100;
            if((onesDigit*onesDigit*onesDigit+tensDigit*tensDigit*tensDigit+hundredsDigit*hundredsDigit*hundredsDigit)==i){
                System.out.print(i+"\t");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
