package com.company;
import java.util.Scanner;

public class ArrangeArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0; i<t; i++){
            int n = scn.nextInt();
            int[] arr = new int[n];
            int j=0; int k=n-1;
            for(int l=1; l<=n; l++){
                if(l%2==0){
                   arr[k]=l;
                   k--;
                }else{
                    arr[j]=l;
                    j++;
                }
            }
            for(int l=0; l<n; l++){
                System.out.print(arr[l]+ " ");
            }
        }
    }
}
