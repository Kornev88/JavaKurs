package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2019));

    }

    static boolean isLeapYear(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }

    }

}



