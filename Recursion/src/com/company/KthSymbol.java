package com.company;

public class KthSymbol {

    public static int kthSymbol(int n, int k){
        if(n==1 && k==1){
            return 0;
        }
        int mid = (int)Math.pow(2,n-1)/2;
        if(k<=mid){
            return kthSymbol(n-1,k);
        }else if(kthSymbol(n-1,k-mid)==0){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(kthSymbol(1,1));
        System.out.println(kthSymbol(2,1));
        System.out.println(kthSymbol(2,2));
    }
}
