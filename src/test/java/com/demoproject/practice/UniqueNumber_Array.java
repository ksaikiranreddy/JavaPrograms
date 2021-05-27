package com.demoproject.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueNumber_Array {

    public static void main(String[] args) {

        int[] a={2,4,5,4,3,6,2,5,4};

        //ArrayList<Integer> al=new ArrayList<Integer>();
        /*for (int i=0;i<a.length;i++)
        {
            if(al.contains(a[i]))
            {
                continue;
            }
            else
            {
                al.add(a[i]);
            }
        }
        System.out.println(al);*/

        HashSet<Integer> hashSet=new HashSet<Integer>();

        for (int i=0;i<a.length;i++)
        {
            hashSet.add(a[i]);
        }

        System.out.println(hashSet);
    }
}
