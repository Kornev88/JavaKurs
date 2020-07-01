package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getPrimeNumber(10,200000));
    }


  public static String getPrimeNumber(int a, int b){
        String resString="";
        int min=(a>b)?b:a;
        int max=(a>b)?a:b;

        for(int i = min; i<=max; i++){
            boolean isPrime=true;
            for(int j=2; j<=i/2; j++){
                if( (i%j)==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                resString=resString+i+" ";
            }
        }

        return resString;
  }
}
