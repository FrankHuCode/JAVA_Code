package com.sxt;

public class test1 {
        public static void main(String[] args) {
            getSum(1,2);
            getSum(1.5,2.5);
            getSum(5,5.5);
        }
        public static void getSum(int num1,int num2){

            System.out.println(num1+"+"+num2+"="+(num1+num2));
        }
        public static void getSum(double num1,double num2){

            System.out.println(num1+"+"+num2+"="+(num1+num2));
        }
    }
