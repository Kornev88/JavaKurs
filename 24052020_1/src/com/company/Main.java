package com.company;

public class Main {

    public static void main(String[] args) {
     printPrimeNumbers(4,20);
     System.out.println(printPrimeNumbers(5,6));

    }
    public static void printPrimeNumbers(int start, int finish){
        boolean rez=true;
       for (int a=start; a<=finish; a++){

           for (int b=finish; b<a; b++){
               if((a%b)==0);
               rez=false;
               break;

           }




       }
    }

        }
