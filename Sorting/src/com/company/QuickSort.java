package com.company;

public class QuickSort {

    public static int partition(int l,int h,int[] arr){
        int pivot = arr[l];
        int pivotIndex = l;
        int i = l;
        int j = h;
        while(i<j){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1 = arr[j];
        arr[j] = arr[pivotIndex];
        arr[pivotIndex] = temp1;

        return j;
    }

    public static void quickSort(int l,int h,int arr[]){
        //int j = h;
        if(l<h){
            int pivotPos = partition(l,h,arr);
            quickSort(l,pivotPos-1,arr);
            quickSort(pivotPos+1,h,arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        quickSort(0,arr.length-1,arr);
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
