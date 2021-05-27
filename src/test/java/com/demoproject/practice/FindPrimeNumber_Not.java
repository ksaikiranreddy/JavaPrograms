package com.demoproject.practice;

public class FindPrimeNumber_Not {

    public static void main(String[] args) {

        int[] a={20,30,4,3,7,9};

        for(int i=0;i<a.length;i++) {
            int flag=0;
            for(int j=2;j<a[i]/2;j++) {

                if ((a[i] % j) == 0) {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("prime number" + a[i]);
            }
        }
    }
}
