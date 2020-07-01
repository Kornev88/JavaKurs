package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getResult(3,5));
	// write your code here
    }
    public static String getResult(int a, int b){
        String result="";
        int i=a;
        while (i<=b){
            result=result+i+" ";
            i++;

        }

        return result;

    }
}
