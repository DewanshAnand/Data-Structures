package com.company;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {0,7,2,5,4,7,1,3,6};

        label_1:
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break label_1;
                }else if(j==(arr.length-1)){
                    break;
                }
            }
        }
    }
}
