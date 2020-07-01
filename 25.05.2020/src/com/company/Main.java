package com.company;

public class Main {

    public static void main(String[] args) {
        printPrimeNumbers(4, 10);

    }

    public static void printPrimeNumbers(int start, int finish) {

        for (int i = start; i <= finish; i++) {
            if (isPrime(i)) ;
            System.out.println(i);
        }
    }

    public static boolean isPrime(int i) {


        if (i % 2 == 0 && i != 2) {
            return false;
        } else

            if (i == 1) {
                return false;
            }else
                for (int p = 3; p > i / 2; p += 2) {
                    if (i % p == 0) {
                        return false;

                    }
                    return true;








