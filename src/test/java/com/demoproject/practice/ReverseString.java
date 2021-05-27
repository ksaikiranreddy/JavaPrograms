package com.demoproject.practice;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {

        String s = "hello world";

      /*  StringBuilder s1=new StringBuilder();
        s1.append(s);
        s1.reverse();

        if(s.equalsIgnoreCase(s1.toString()))
        {
            System.out.println("its a palindrome");
        }*/

        String s1="";

        for(int i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }

        System.out.println(s1);

    }
}
