package com.company;

public class Main {

    public static void main(String[] args) {
        int day;
        int month;
        int year;

     printDate(22,3,1983,"/");
     printDate(8,10,2020,"-");
     printDate(17,45,1988,"-");

    }
    public static void printDate(int day, int month, int year, String delimeter){
        String rez=" ";
        if(day<10){
            rez=(rez+"0"+day);
        }else{
            rez=(rez+day);
        }
        rez=(rez+delimeter);
        if(month<10) {
            rez = (rez + "0" + month);
        }else{
            rez=(rez+month);
        }
        rez=(rez+delimeter+year);

        System.out.println(rez);

    }
}
