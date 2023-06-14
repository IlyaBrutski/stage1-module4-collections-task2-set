package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : sourceList){
            int sqr = (int) Math.pow(i, 2);
            if(sqr >= lowerBound && sqr <=upperBound){
                set.add(sqr);
            }
        }
        return set;
    }
}
