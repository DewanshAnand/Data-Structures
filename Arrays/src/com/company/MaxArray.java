package com.company;

import java.util.Scanner;

public class MaxArray {

    public static void main(String[] args) {
	// write your code here
        int arr[] = {5,6,7,8,9,12};
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
