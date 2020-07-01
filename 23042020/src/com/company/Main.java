package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int v = 1;
        division(a,b);
        division(a,v);
        division(12,6);
        division(18,3);
        division(20.00,3.00);
        division(20.00,3);

    }
    public static void division(int a, int b){
        System.out.println("a/b="+ a/b);
    }
    public static void division(double a, double b){
        System.out.println(a+"/"+b+"="+(a/b));
    }
    public static void division(double a, int b){
        System.out.println("------");
        System.out.println(a+"/"+b+"="+(a/b));
    }
}
