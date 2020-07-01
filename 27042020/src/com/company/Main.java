package com.company;

public class Main {

    public static void main(String[] args) {
        int day;
        int month;
        int year;
        printDate(5, 6, 2020, "-");
        printDate(10, 5, 2020, "-");
    }

    public static String printDate(int day, int month, int year, String delimeter) {
        String rez = " ";
        if (day < 10) {
            rez = (rez + "0" + day);
        } else {
            rez = (rez + day);

            rez = (day + delimeter);
        }
        if (month < 10) {
            rez = (rez + "0" + month);
        } else {
            rez = (rez + month);
        }
        rez = (day + delimeter + month + delimeter + year);
        System.out.println(rez);
    }

    }



}







