package com.company;

public class Main {

    public static void main(String[] args) {
	int[] mas = {10,2,4,56,34,5,6,98,3,2,45};
	System.out.println(findMin(mas));
	System.out.println(findMax(mas));
	printRez(mas);

    }
    public static int findMin(int[] mas){
        int min = mas[0];
        for (int i=1; i<mas.length; i++){
            if(min>mas[i]){
                min=mas[i];
            }
        }
        return min;
    }
    public static int findMax(int[] mas){
        int max=mas[0];
        for(int i=0;i<mas.length;i++){
            if(mas[i]>max){
                max=mas[i];
            }
        }
        return max;
    }
    public static void printRez(int[] mas){
        int rez=findMax(mas)-findMin(mas);
        System.out.println(rez);
    }
}
