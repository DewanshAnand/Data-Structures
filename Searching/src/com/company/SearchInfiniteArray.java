package com.company;

public class SearchInfiniteArray {

    public static int searchInfiniteArray(int[] arr, int k){
        int low = 0;
        int high = 1;
        while(arr[high]<k){
            low = high;
            high = 2*high;
        }
        return binarySearch(arr,k,low,high);
    }

    public static int binarySearch(int arr[],int key,int l,int h){
        while(l<=h){
            int mid = (l+h)/2;
            if(key==arr[mid]){
                return mid;
            }else if(arr[mid]>key){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,16,17,20,25,32,36};
        System.out.println(searchInfiniteArray(arr,13));
    }
}
