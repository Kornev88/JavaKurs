package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println(isTen(10,0));
       // System.out.println(isTen(5,5));
        //System.out.println(isTen(3,3));
        System.out.println(isTrue(5,125));
        boolean isDoor=true;
        int time=5;
        System.out.println(isDoorOpen((isDoor,time)?"alarm":"silence");


    }
    public static boolean isTrue(int temp1,int temp2){
        return ((temp1<0&&temp2>100)||(temp2<0&&temp1>100));
    /*public static boolean isTen(int a, int b){
        return (a==10)^(b==10)||((a+b)==10);*/

        }
     public static boolean isDoorOpen(boolean isDoor, int time){
       return isDoor && (time>=22&&time>=24)||(time>=0&&time<=7)||(time>=13&&time<=14);
     }
    }

