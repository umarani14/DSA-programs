package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,1}; int  k = 3;
		containsDuplicate(nums, k);
	}
	
	static boolean containsDuplicate(int[] nums,int k) {
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<=nums.length-1;i++) {
			if(map.containsKey(nums[i])) {
				System.out.println(" map.get(nums[i] is "+ map.get(nums[i]));
				System.out.println(" nums[i] value is -- "+ nums[i]);
				int abs=Math.abs(map.get(nums[i])-i);
				if(abs<=k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		
		return false;
	}

}
