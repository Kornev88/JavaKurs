package com.company;

public class Main {

    public static void main(String[] args) {

        String[] names= {"Oleg","Svetlana","Oleg","Maria"};
        String name="Oleg";
        countNames(name,names);


    }
    public static void countNames(String name,String[] names){
        int count=0;
        for(int i=0; i<names.length; i++){
            if(names[i].equals(name)){
                count++;

        }


            }
        System.out.println(count);
        }
    }


