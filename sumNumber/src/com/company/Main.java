package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println(sumNumber(111));
	System.out.println(sumNumber(222));
    }
    public static int sumNumber(int number){

        int hundert=number/100;
        number=number-hundert*100;
        int tenth= number /10;
        number= number - tenth*10;
        int result= number+hundert+tenth;

        return result;
    }
}
