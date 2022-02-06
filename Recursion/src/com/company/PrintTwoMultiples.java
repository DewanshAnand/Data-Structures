package com.company;

public class PrintTwoMultiples {

    public static void printTwoMultiples(int n){
        if(n==2){
            System.out.print("2" + " ");
            return;
        }
        printTwoMultiples(n-1);
        if(n%2==0){
            System.out.print(n + " ");
        }


    }

    public static void main(String[] args) {
        printTwoMultiples(11);
    }
}
