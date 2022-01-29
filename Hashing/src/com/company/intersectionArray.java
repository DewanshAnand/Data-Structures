package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class intersectionArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        int count=0;
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        for(int j=0; j<b.length; j++){
            b[j] = scn.nextInt();
        }
        HashSet<Integer> s = new HashSet<>();
        for(int k=0; k< a.length; k++){
            s.add(a[k]);
        }
        for(int l=0; l<b.length; l++){
            if(s.contains(b[l])){
               count++;
               s.remove(b[l]);
            }
        }
        System.out.println(count);
    }
}
