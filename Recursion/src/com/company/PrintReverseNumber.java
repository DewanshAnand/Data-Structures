package com.company;

public class PrintReverseNumber {

    public static void reverseNumbers(int n){
        if(n==1){
            System.out.println("1" + " ");
            return;
        }
        System.out.print(n  + " ");
        reverseNumbers(n-1);
    }

    public static void main(String[] args) {
        reverseNumbers(10);
    }
}
