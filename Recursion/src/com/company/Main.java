package com.company;

public class Main {

    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        printNumbers(n-1);
        System.out.print(n + " ");
    }


    public static void main(String[] args) {
	// write your code here
        printNumbers(10);
    }
}
