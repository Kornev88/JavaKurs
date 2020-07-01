package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(totalAmount(2,2));
        System.out.println(totalAmount(3,5));
        System.out.println(totalAmount(5,5));
        System.out.println(totalAmount(10,12));
        System.out.println(totalAmount(2,7));
    }
    public static int totalAmount(int a,int b){

        int i=(a>b)?b:a;
        int sum=0;
        while (i<= ((a>b)?a:b) ){
            sum=sum + i;
            i++;
        }
        if(a==b){
            return(a+b);
        }
        return sum;
    }
}