package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class PermutationWithSpaces {

    public static ArrayList<String> permutationWithSpaces(String input, String output, ArrayList<String> ans) {
        if (input.length() == 0) {
            ans.add(output);
            return ans;
        }
        String output1 = output + " " + input.charAt(0);
        String output2 = output + input.charAt(0);
        String smallInput = "";
        if (input.length() == 1) {
            smallInput = "";
        } else {
            smallInput = input.substring(1);
        }

        permutationWithSpaces(smallInput, output1, ans);
        permutationWithSpaces(smallInput, output2, ans);
        return ans;
    }
    public static ArrayList<String> permutationWithSpaces(String Str){
        ArrayList<String> ans = new ArrayList<>();
        if(Str.length()<=1){
            ans.add(Str);
            return ans;
        }

        permutationWithSpaces(Str.substring(1), Str.substring(0,1), ans);
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(permutationWithSpaces("abc"));
    }
}
