package com.company;

public class Main {

    public static void main(String[] args) {
        boolean Month= checkMonth(17);

        System.out.println(Month);


    }
    public static boolean checkMonth(int month){
        if((month>1)&&(month<12)) {
            return true;
        }else {
            return false;
        }
    }
}
