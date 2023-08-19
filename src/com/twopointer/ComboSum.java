package com.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 
 */
public class ComboSum {
	
	public static void main(String[] args) {
		ComboSum comboSum=new ComboSum();
		int[] candidates= {10,1,2,7,6,1,5};
		int target=8;

//		System.out.println(comboSum.combinationSum1(candidates, target));
		System.out.println("====");
		System.out.println(comboSum.combinationSum11(candidates, target));
	}
	List<List<Integer>> res = new ArrayList<>();
	
    public List<List<Integer>> combinationSum1(int[] candidates, int target) {
    	Arrays.sort(candidates);
    	recursiveMethod(candidates, target, 0, new ArrayList<Integer>());
        return res;
    }
    
    private void recursiveMethod(int[] cands, int target, int initialPosition, List<Integer> curList) {
        if (target == 0) res.add(curList);
        
        for (int i = initialPosition; i < cands.length; i++) {
            if (cands[i] <= target) {
                List<Integer> list = new ArrayList<>(curList);
                list.add(cands[i]);
                recursiveMethod(cands, target - cands[i], i, list);
            }
        }
    }
    
    public List<List<Integer>> combinationSum11(int[] candidates, int target) {
    	Arrays.sort(candidates);
    	
    	recursiveMethod1(candidates, target, 0, new ArrayList<Integer>());
        return res;
    }
    
    private void recursiveMethod1(int[] cands, int target, int initialPosition, List<Integer> curList) {
        if (target == 0) res.add(curList);
        while(initialPosition<=cands.length-1) {
        	if(initialPosition>0 && cands[initialPosition]==cands[initialPosition-1]) {
        		initialPosition++;
        		continue;
        	}
        	if(cands[initialPosition]<=target) {
        		 List<Integer> list = new ArrayList<>(curList);
                 list.add(cands[initialPosition]);
                 recursiveMethod1(cands, target - cands[initialPosition], initialPosition+1, list);
        	}
        	initialPosition++;
        }
        
//        int[] candidates= {10,1,2,7,6,1,5}; 1 1 2 5 6 7 10
        
//        for (int i = initialPosition; i < cands.length; i++) {	
//        	if(i>initialPosition && cands[i]==cands[i-1]) {
//        		continue;
//        	}
//            if (cands[i] <= target) {
//                List<Integer> list = new ArrayList<>(curList);
//                list.add(cands[i]);
//                recursiveMethod1(cands, target - cands[i], i+1, list);
//            }
//        }
        
        
    }

}
