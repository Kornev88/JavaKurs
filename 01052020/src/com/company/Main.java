package com.company;

public class Main {

    public static void main(String[] args) {
        
        multiplay(5,6);
        minus(5,6);
        division(20,3);
        addition(10,10);
        division(100,5);
        division(65.0,7.0);
    }
    public static void multiplay(int a, int b){
        System.out.println(a +"*"+ b + "=" + a*b);
    }
    public static void minus(int a, int b){

        System.out.println(a + "-" + b + "=" + (a-b) );

    }
    public static void division(double a, double b){
        System.out.println(a + "/" + b + "=" + a/b);
    }
    public static void division(int a, int b) {
        System.out.println(a + "/" + b + "=" + a / b);
    }
    public static void addition(int a, int b){

        System.out.println(a + "+" + b + "=" + (a+b));
    }
}
