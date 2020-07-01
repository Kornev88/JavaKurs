package com.company;

public class Main {



    public static void main(String[] args) {
        String a;
        a = "qwer";
        String day = "22";
        String month = "04";
        String year = "2020";
        String space = "-";

        String date;
        date = day + space + month + space + year;
        System.out.println(date);

        printDate(22,04,2020);

	// write your code here
    }

    public static void printDate(int a,int b,int c){
        System.out.println("22/04/2020");
        System.out.println(a+"-"+b+"-"+c);
    }
}
