package com.demoproject.practice;

import java.util.HashMap;

public class FindNumberOfOccurences_Characters {

       public void FindNumberOfCharacters(String a)
        {
            HashMap<Character,Integer> hashMap=new HashMap<Character, Integer>();

            for (int i=0;i<a.length();i++)
            {
                if (hashMap.containsKey(a.charAt(i)))
                {
                    hashMap.put(a.charAt(i),hashMap.get(a.charAt(i))+1);
                }
                else
                {
                    hashMap.put(a.charAt(i),1);
                }
            }

            System.out.println(hashMap);
        }
}
