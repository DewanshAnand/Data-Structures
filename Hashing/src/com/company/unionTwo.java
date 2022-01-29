package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class unionTwo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for(int i=0; i<3; i++){
            a[i] = scn.nextInt();
        }
        for(int j=0; j<3; j++){
            b[j] = scn.nextInt();
        }
        HashSet<Integer> s = new HashSet<>();
        for(int k=0; k<a.length; k++){
            s.add(a[k]);
            s.add(b[k]);
        }
        System.out.println(s);

    }
}
