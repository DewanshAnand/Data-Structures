package com.company;

import java.util.Scanner;

public class SwapAlternate {
    public static void main(String[] args) {
        int arr[] = {5,9,78,45,3,67};
        int swap;
        for(int i=0; i<arr.length-1; i=i+2){
            swap = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = swap;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
