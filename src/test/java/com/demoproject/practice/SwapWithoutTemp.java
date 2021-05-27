package com.demoproject.practice;

public class SwapWithoutTemp {

    public static void main(String args[])
    {
        int a=2;
        int b=3;

        a=a+b;  //2+3=5
        b=a-b;  //5-3=2
        a=a-b;  //2-5=-3

        System.out.println("a:"+a+" "+"b:"+b);
    }
}
