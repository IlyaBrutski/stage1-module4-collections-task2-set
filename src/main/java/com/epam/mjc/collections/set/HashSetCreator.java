package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(Integer i : sourceList) {
            int k = i;
            hashSet.add(k);
            if(k % 2 != 0){
                hashSet.add(k*2);
            } else {
                while(k%2 == 0){
                    k /= 2;
                    hashSet.add(k);
                }
            }
        }
        return hashSet;
    }
}
