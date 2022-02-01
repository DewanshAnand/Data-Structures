package com.company;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min = arr[i];
            int minIndex = i;
            for(int j=i+1; j< arr.length; j++){
                if(min>arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(i!=minIndex) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        int[] arr = {7,2,9,6,1,5,4};
        selectionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
