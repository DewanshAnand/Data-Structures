package com.company;

public class Sort01 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,0,1};
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(count>0){
                arr[i]=0;
                count--;
            }else{
                arr[i]=1;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
