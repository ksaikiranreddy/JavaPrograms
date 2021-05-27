package com.demoproject.practice;

public class Reverse_Number {
    public static void main(String[] args) {

        int a=23;
        int rev=0;

       for(int i=0;a>0;i++)
       {
           rev=(rev*10)+(a%10);
           a=a/10;

       }

        System.out.println(rev);
    }
}
