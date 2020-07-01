package com.company;

public class Main {

    public static void main(String[] args) {


       int[] numbers1 = {10, 3, 3, 5, -9};

        for (int i = 0; i < numbers1.length; i++) {
        }
            int n = numbers1.length;
            int rez;
            for(int i=0; i< n/2; i++) {
                rez = numbers1[n - i - 1];
                numbers1[n - i - 1] = numbers1[i];
                numbers1[i] = rez;
            }

          for(int i=0; i< numbers1.length;i++){
              System.out.println(numbers1[i]);

            }
        }


    }



