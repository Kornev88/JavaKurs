package com.company;

public class Main {

    public static void main(String[] args) {
     check(5);

    }

    public static int check(int c) {
        int a = 100;
        int b = (a / 30 > 3) ? 3 : 4;
        if (b < 5 || a < 5) {
            a = a / b;
          
        }
        return a;

    }


}