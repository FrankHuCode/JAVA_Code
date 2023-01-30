package com.itheima.practise;

import java.util.Random;
import java.util.Scanner;

public class PracticeDemo7 {
    public static void main(String[] args) {
        //需求：模拟双色球开奖

        //1.定义一个方法用于产生6个红球（1~33）+1个蓝球（1~16），用数组来存储
        int[] luckyBalls = createLuckyBalls();
        //2.定义一个方法用于用户输入6个红球+1个蓝球，用数组存储
        int[] userBalls = userInputBalls();
        System.out.println("请确认您选择的双色球号码：");
        printArray(userBalls);
        //3.判断用户的双色球号码与开奖号码是否相同，根据不同中奖结果给出提示
        System.out.println("本期双色球开奖号码是：");
        printArray(luckyBalls);
        judge(luckyBalls, userBalls);
    }

    public static void judge(int[] luckyBalls, int[] userBalls) {
        //a.定义2个整型变量，分别存储红球命中个数和篮球命中个数
        int redHitBalls = 0;
        int buleHitBalls = 0;
        //b.嵌套for循环,统计红蓝球的命中个数
        for (int i = 0; i < userBalls.length - 1; i++) {
            for (int j = 0; j < luckyBalls.length - 1; j++) {
                //判断用户的红球命中情况，统计个数
                if (userBalls[i] == luckyBalls[j]) {
                    redHitBalls++;
                    break;
                }
            }
        }
        //c.统计蓝球命中情况
        buleHitBalls = userBalls[userBalls.length - 1] == luckyBalls[luckyBalls.length - 1] ? 1 : 0;
        //提示用户命中红蓝球情况
        System.out.println("您中了"+redHitBalls+"个红球");
        System.out.println("您中了"+buleHitBalls+"个蓝球");
        //d.根据红蓝球命中个数分别给出中将提示
        if (buleHitBalls == 1 && redHitBalls < 3) {
            System.out.println("恭喜您中奖了！奖金5元！");
        } else if (buleHitBalls == 1 && redHitBalls == 3 || buleHitBalls == 0 && redHitBalls == 4) {
            System.out.println("恭喜您中奖了！奖金10元！");
        } else if (buleHitBalls == 1 && redHitBalls == 4 || buleHitBalls == 0 && redHitBalls == 5) {
            System.out.println("恭喜您中奖了！奖金200元！");
        } else if (buleHitBalls == 1 && redHitBalls == 5) {
            System.out.println("恭喜您中奖了！奖金3000元！");
        } else if (buleHitBalls == 0 && redHitBalls == 6) {
            System.out.println("恭喜您中奖了！奖金最高500万元！");
        } else if (buleHitBalls == 1 && redHitBalls == 6) {
            System.out.println("恭喜您中奖了！奖金最高1000万元！");
        } else {
            System.out.println("很遗憾未中奖！请再接再励！");
        }
    }

    public static int[] userInputBalls() {
        //a.定义一个数组用于返回值
        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("请您输入第" + (i + 1) + "个红球（1~33）：");
            int data = sc.nextInt();
            numbers[i] = data;
        }
        System.out.println("请您输入1个红球（1~16）：");
        numbers[numbers.length - 1] = sc.nextInt();
        return numbers;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
            ;
        }
        System.out.println("]");
    }

    public static int[] createLuckyBalls() {
        //a.定义一个数组用于返回
        Random r = new Random();
        int[] numbers = new int[7];
        //b.循环产生6个不重复的红球
        for (int i = 0; i < numbers.length - 1; i++) {
            int data = r.nextInt(33) + 1;
            //设置一个信号位：标识 默认这个数是不重复的数
            boolean flag = true;//标识太好用：先默认true再判断：否false 是true
            //c.用一个死循环判断红球是否重复
            while (true) {
                for (int j = 0; j < i; j++) {
                    if (numbers[i] == numbers[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    numbers[i] = data;
                    break;
                }
            }
        }
        numbers[numbers.length - 1] = r.nextInt(16) + 1;
        return numbers;
    }
}
