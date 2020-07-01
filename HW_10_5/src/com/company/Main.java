package com.company;

public class Main {

    public static void main(String[] args) {
	String[] names = {"Oleg","Oleg","Marina","Alina","Kolya"};
	String[] names1 = {"Oleg","Marina","Oleg","Alina","Kolya"};




    }
    public static boolean checkDupli(String[] names) {
        for (int i = 0; i < names.length; i++) {
            int count = 0;
            //for (int j = 0; j <= names.length-1; j++) {
            if (names[i].equals(names[i])) {
                count++;

            }

        }
    }

        public static String arrToString(String[] names){
        String str=" ";
        for (int i;i<names.length; i++){
            str+=names[i]+" ";
        }

     return str;


}
