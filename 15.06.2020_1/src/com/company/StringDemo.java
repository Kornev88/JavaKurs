package com.company;

public class StringDemo {
    public static void main(String[] args){
        char[] ch={'h','e','k','o','r'};
        String s="hello";
        String s1= new String("Hello");
        String s2= new String(ch);
        System.out.println(s2);
        for (char c:ch){
            System.out.println(c);
        }

    }
}

