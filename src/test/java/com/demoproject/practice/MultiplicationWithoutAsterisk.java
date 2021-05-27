package com.demoproject.practice;

public class MultiplicationWithoutAsterisk {

    public static void main(String[] args) {

        int mul=multiply(3,5);
        System.out.println(mul);
    }

    private static int multiply(int n1, int n2) {

        int sum=0;
        for(int i=0;i<n2;i++)
        {
            sum=sum+n1;
        }
        return sum;
    }
}
