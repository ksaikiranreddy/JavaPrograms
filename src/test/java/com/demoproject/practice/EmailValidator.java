package com.demoproject.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public static void main(String[] args) {

        String s="saikiran.kudumula@gmail.com";

        Pattern p=Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

        Matcher m= p.matcher(s);
        boolean matchFound=m.matches();

        //aadhar card validator=("^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]$")

        if(matchFound) {
            System.out.println(m.group());
            System.out.println("match is found");
        }
        else {
            System.out.println("match is not found");
        }
    }
}
