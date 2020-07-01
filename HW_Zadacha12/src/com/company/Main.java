package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(tempBulb(-1,105));
        System.out.println(tempBulb(6,7));
        System.out.println(tempBulb(-5,6));
        System.out.println(tempBulb(5,105));
        System.out.println(tempBulb(-100,500));
    }

  public static boolean tempBulb(int a, int b){
        boolean bool=(a<0)&&(b>100);
        if(bool){
            return true;
        }else{
            return false;
        }

  }





}



