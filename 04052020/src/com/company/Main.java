package com.company;

public class Main {

    public static void main(String[] args) {

     System.out.println(switchDigits(17));




        }
    public static int switchDigits(int xy) {
        if ((xy > 9) && (xy < 100)) {
             int tens=xy/10;
             int ones=xy-tens*10;
             return ones*10+tens;
        }
        return 0;


    }


}
