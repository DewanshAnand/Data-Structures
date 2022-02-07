package com.company;

public class PrintSubsets {

    public static void printSubsets(String input, String output){
        if(input.length()==0){
            System.out.println(output);
            return;
        }


        String output2 = output;
        String output1 = output + input.charAt(0);
        input = input.substring(1);
        printSubsets(input,output1);
        printSubsets(input,output2);
    }

    public static void printSubsets(String s){
        String in = new String(s);
        String out = new String("");
        printSubsets(in, out);
    }

}
