package com.company;

public class Main {

    public static void main(String[] args) {
      System.out.println(add(2,10));
      System.out.println(add(3,5));
      System.out.println(add(5,5));
      System.out.println(add(10,1));
    }

    public static boolean add(int a, int b) {
        boolean bool=(a==10) ||(b==10) || (a+b==10);
        if (bool) {
            return true;
        }else
          {
            return false;


        }

    }

}