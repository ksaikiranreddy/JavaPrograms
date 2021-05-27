package com.demoproject.practice;

public class Practice2 {

    public static void main(String args[])
    {
        int[] a={10,21,4,53,6,4,7,55,78};

        for(int i=0;i<a.length;i++)
        {
            int temp = 0;
            for (int j=1;j<a.length;j++) {
                if (a[j] > a[j - 1]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i=0;i< a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

}
