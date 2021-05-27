package com.demoproject.practice;

public class FibanocciSeries {

    public static void main(String[] args) {

        int n=5,n1=0,n2=1,n3;

        for(int i=0;i<n;i++)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }

}
