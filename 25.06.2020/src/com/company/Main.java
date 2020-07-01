package com.company;

public class Main {

    public static void main(String[] args) {
     int[] arrays = {2,4,3,3,5,7};
     addPairs(arrays);
    }
    public static void addPairs(int[] arrays) {
        int sum = 6;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if (j != i && (arrays[i] + arrays[j]) == sum) {
                    System.out.println(arrays[i] + " " + arrays[j]);
                }

            }
        }
    }
}
