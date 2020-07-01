package com.company;



public class Main {

    public static void main(String[] args) {
	int[] arr = {1,2,3};
	method(arr);
		System.out.println(Arrays.toString(arr));
    }
    public static int[] method(int[] arr){
    	int[] saveArray=arr;
    	arr[1]=6;
    	return saveArray;
	}
}
