package com.company;

public class Main {

    public static void main(String[] args) {
       int a = 10;
       boolean bool= true;
       int res0fmax=max(a-10,+100);
        System.out.println(max(a,100));
	// write your code here
    }

    public static int max(int a, int b){
        int rez;
        boolean bool = a>b;

        //if (){} else {}
        if (bool) {
            rez = a;
        } else {
            rez=b;
        }
            return rez;
    }
    public static boolean isMaxThan100(int a){
        boolean bool = a>100;
        if(bool) {
            System.out.println(a+"is bigger than 100");
            return true;
        }else{
            System.out.println
            return false;
        }


    }

}
