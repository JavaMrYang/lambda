package com.exam;

public class StringTest {
    public static void main(String[] args) {
       final String s1="abc";
       final StringBuilder s2=new StringBuilder("abc");
       System.out.println(s1==s2.toString());
       //s1+="d";
       s2.append("d");
        System.out.println(s1.equals(s2));

    }
}
