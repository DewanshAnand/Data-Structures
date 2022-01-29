package com.company;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,1,6,2};

        label_1:
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    break;
                }else if(j==(arr.length-1)){
                    System.out.println(arr[i]);
                    break label_1;
                }
            }
        }
    }
}
