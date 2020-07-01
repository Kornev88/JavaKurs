package com.company;

public class Main {

    public static void main(String[] args) {
        int[] min = {1, 2, 3, 4, 5};
      System.out.println(printMin(min));
    }

    public static int printMin(int[] ints) {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (min > ints[i]) {
                min = ints[i];
            }
        }
        return min;

    }
}