package com.company;

public class Main {

    public static void main(String[] args) {
	int[] array;
	getIndexMaxInArray(array,10,20);
    }
    public static int getIndexMaxInArray(int[] arr, int indexStart, int indexFinish) {
        indexStart=Math.max(indexStart,0);
        int max = arr[indexStart];
        int maxIndex=indexStart;
        for (int i = indexStart; i < Math.min(indexFinish,arr.length); ++i) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex=i;
            }
    }
}
