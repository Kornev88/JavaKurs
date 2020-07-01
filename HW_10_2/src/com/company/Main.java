package com.company;

public class Main {

    public static void main(String[] args) {
	int[] mas=new int[10];
	printMas(mas);
    }
    public static void printMas(int[] mas){
        for(int i=0;i<mas.length; i++){
            if(i<2){
                mas[i]=1;
            }
            else{
                mas[i]=mas[i-2]+mas[i-1];
            }
            System.out.print(mas[i]+" ");
        }
    }
}
