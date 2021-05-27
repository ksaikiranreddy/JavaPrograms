package com.demoproject.practice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        //find prime number till 20
int flag=0;
        for(int i=2;i<n;i++)
        {
           if(n%i==0)
           {
               flag=1;
               break;
           }
        }

        if (flag==1)
        {
            System.out.println("not prime number");
        }
        else
        {
            System.out.println("prime number");
        }
    }
}
