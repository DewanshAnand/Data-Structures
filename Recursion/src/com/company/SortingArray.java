package com.company;

import java.util.ArrayList;

public class SortingArray {

    public static void insertTop(ArrayList<Integer> arr, int temp){
        if(arr.size()==0 || arr.get(arr.size()-1)<=temp){
            arr.add(temp);
            return;
        }
        int temp1 = arr.remove(arr.size()-1);
        insertTop(arr,temp);
        arr.add(temp1);
    }

    public static void sortArray(ArrayList<Integer> arr){
        if(arr.size()<=1){
            return;
        }
        int temp = arr.remove(arr.size()-1);
        sortArray(arr);
        insertTop(arr,temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        System.out.println(arr);
        sortArray(arr);
        System.out.println(arr);
    }
}
