package com.company;

public class Main {

    public static void main(String[] args) {







    }

    public static boolean isLeap(int year){
        return (year % 400 == 0) || (year % 4 == 0) && (year % 100!= 0);


    }
    public static int countDayPerMonth(int year, int month){
        if (month==2) {
            if(isLeap(year)){
                return 29;
                {else{
            }
        }
    }
}
