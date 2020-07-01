package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr=new int []{5,3,6,2,4,1,1,1};

	bubbleSort(arr);





    }
    public static void bubbleSort(int[] arr){

        for (int i =0; i<arr.length; i++ ) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
    }
    public static void print(int[] arr){
        for (int i:arr){
            System.out.println(i+" ");

        }
        System.out.println(0);
    }



            }


}
