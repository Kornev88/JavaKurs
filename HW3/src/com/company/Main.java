package com.company;

public class Main {

    public static void main(String[] args) {

        printDate(, 6, 2020);



    }


    public static void printDate(int day, int month, int year) {
        if (day > 9) {
            System.out.println(day + "/" + month + "/" + year);
        }
            if (month> 9) {
        } else {
            System.out.println("0" + day + "/"+"0" + month + "/" + year);
        }

        }
    }
