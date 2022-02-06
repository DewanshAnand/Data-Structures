package com.company;

public class PrintPrimeNumbers {

    public static void printPrimeNumbers(int n){
        if(n==2){
            System.out.print("2" + " ");
            return;
        }
        printPrimeNumbers(n-1);
        for (int i = 2; i < n/2; i++){
            if (n % i == 0){
                return;
            }
        }
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        printPrimeNumbers(12);
    }

}
