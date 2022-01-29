package com.company;
import java.util.HashSet;
import java.util.Scanner;

public class countDistinct {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int[] a = new int[4];
        for(int i=0; i<4; i++){
            a[i] = scn.nextInt();
        }
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i=0; i<a.length; i++){
            s.add(a[i]);
        }
        System.out.println(s);
        System.out.println(s.size());


    }
}
