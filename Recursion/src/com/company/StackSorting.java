package com.company;

import java.util.Stack;

public class StackSorting {

    public static void insertTop(Stack<Integer> s, int temp){
        if(s.size()==0 || s.peek()<=temp){
            s.push(temp);
            return;
        }
        int temp1 = s.pop();
        insertTop(s,temp);
        s.push(temp1);
    }
    public static void stackSort(Stack<Integer> s){
        if(s.size()==0){
            return;
        }
        if(s.size()==1){
            return;
        }
        int temp = s.pop();
        stackSort(s);
        insertTop(s,temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(3);
        s.push(4);
        s.push(2);
        int size = s.size();
        for(int i=0; i<size; i++){
            System.out.print(s.pop() + " ");
        }
    }
}
