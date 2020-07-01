package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkDebit(1000,500));
        System.out.println(checkDebit(1000,1000));
        System.out.println(checkDebit(10,300));




    }
    public static boolean checkDebit(double account,double debitAmount){
        if(account>=debitAmount){
            return true;
        }else{
            return false;
        }

    }
}
