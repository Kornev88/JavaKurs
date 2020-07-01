package com.company;

public class Main {

    public static void main(String[] args) {

         System.out.println(mirrorNum(123));
         System.out.println(mirrorNum(503));
    }

    public static int mirrorNum(int num){
        int mirror = 0;
        while (num!=0){
         mirror=mirror*10+(num % 10);
         num= num/10;
        }
        return mirror;
    }
}

