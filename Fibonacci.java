package com.sxt;

public class Fibonacci {
    public static long fibonacci(long index){
        if(index<=1) {
            return index;
        }
            else{
                return fibonacci(index-1)+fibonacci(index-2);
            }
    }
}
