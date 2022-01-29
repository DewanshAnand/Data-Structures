package com.company;
import java.util.HashMap;
import java.util.Set;

public class basicHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //insert
        map.put("abc",1);
        map.put("def",2);

        //check presence
        if(map.containsKey("abc")){
            System.out.println("Has abc");
        }
        if(map.containsKey("abc1")){
            System.out.println("Has abc1");
        }

        //get value
        int v = 0;
        if(map.containsKey("abc1")){
            v = map.get("abc1");
        }
        System.out.println(v);

        //remove
        int s=map.remove("abc");
        System.out.println(s);

        //size
        System.out.println("size: " + map.size());

        //iterate
        Set<String> keys= map.keySet();
        for(String str:keys){
            System.out.println(str);
        }
    }
}
