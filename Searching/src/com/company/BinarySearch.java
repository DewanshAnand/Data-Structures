package com.company;

public class BinarySearch {

    public static int binarySearch(int[] arr,int k){
        int start_index = 0;
        int last_index = arr.length-1;

        while(start_index<=last_index){
            int mid = (start_index+last_index)/2;
            if(k==arr[mid]){
                return mid;
            }else if(arr[mid]>k){
                last_index = mid-1;
            }else{
                start_index = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr,7));
        System.out.println(binarySearch(arr,0));
    }
}
