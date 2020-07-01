package com.company;

public class Main {

    public static void main(String[] args) {
     countDown(5);
    }
    public static void countDown(int i){
        int counter=5;
        while (counter>0){
            System.out.println("осталось "+counter + " sek");
            counter--;
        }


    }
}
