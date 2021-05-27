package com.demoproject.practice;

import java.util.*;

public class NumberOfOccurences_Words {

    public static void main(String[] args) {


        String a = "hello this is a word program to count program to a number of word and characters";
        String[] b=a.split(" ",-2);
        for(String strings:b)
            System.out.println(strings);

        HashMap<String,Integer> hs=new HashMap<String,Integer>();

        for(int i=0;i<b.length;i++)
        {
            if (hs.containsKey(b[i]))
            {
                hs.put(b[i],hs.get(b[i])+1);
            }
            else {
                hs.put(b[i], 1);
            }
        }
        System.out.println(hs);

       FindNumberOfOccurences_Characters foc=new FindNumberOfOccurences_Characters();

      for (String words:hs.keySet()) {
          foc.FindNumberOfCharacters(words);
      }

    }
}