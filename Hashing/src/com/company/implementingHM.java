package com.company;

import java.util.HashMap;
import java.util.LinkedList;

public class implementingHM {

    public static class HashMap<K,V>{
        private class HMNode{
            K key;
            V value;

            HMNode(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int size;
        private LinkedList<HMNode>[] buckets;

        public HashMap(){
            initbuckets(4);
            size = 0;
        }

        private void initbuckets(int N){
            buckets = new LinkedList[N];
            for(int bi=0; bi<buckets.length; bi++){
                buckets[bi] = new LinkedList<>();
            }
        }

        public void put(K key,V value) throws Exception{
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key,bi);

            if(di == -1){
                HMNode node = buckets[bi].get(di);
                node.value = value;
            }else{
                HMNode node = new HMNode(key,value);
                buckets[bi].add(node);
                size++;
            }
            double lamba = size * 1.0/buckets.length;
            if(lamba>2){
                rehash();
            }
        }

        private int hashfn(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        private int getIndexWithinBucket(K key, int bi){
            for(HMNode node: buckets[bi]){
                if(node.key.equals(key)){
                    return;
                }
                di++;
            }
            return -1;
        }

        public V get(K key) throws Exception{
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key,bi);

            if(di != -1){
                HMNode node=buckets[bi].get(di);
                return node.value;
            }else{
                return false;
            }
        }

        public boolean containsKey(K key){
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key,bi);

            if(di != -1){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {

    }
}
