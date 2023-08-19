package com.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.
 */
public class ComboSumWithoutRepeatations {
	public static void main(String[] args) {
		ComboSumWithoutRepeatations comboSum=new ComboSumWithoutRepeatations();
		int[] candidates= {10,1,2,7,6,1,5};
		int target=8;
		System.out.println(comboSum.combinationSum11(candidates, target));
	}
	List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> combinationSum11(int[] candidates, int target) {
    	Arrays.sort(candidates); 	
    	recursiveMethod1(candidates, target, 0, new ArrayList<Integer>());
        return res;
    }
    
    private void recursiveMethod1(int[] cands, int target, int initialPosition, List<Integer> curList) {
        if (target == 0) res.add(curList);
//        while(initialPosition<=cands.length-1) {
//        	if(initialPosition>0 && cands[initialPosition]==cands[initialPosition-1]) {
//        		initialPosition++;
//        		continue;
//        	}
//        	if(cands[initialPosition]<=target) {
//        		 List<Integer> list = new ArrayList<>(curList);
//                 list.add(cands[initialPosition]);
//                 recursiveMethod1(cands, target - cands[initialPosition], initialPosition+1, list);
//        	}
//        	initialPosition++;
//        }
//        with for loop
        
        for (int i = initialPosition; i < cands.length; i++) {	
        	if(i>initialPosition && cands[i]==cands[i-1]) {
        		continue;
        	}
            if (cands[i] <= target) {
                List<Integer> list = new ArrayList<>(curList);
                list.add(cands[i]);
                recursiveMethod1(cands, target - cands[i], i+1, list);
            }
        }
        
        
    }
}
