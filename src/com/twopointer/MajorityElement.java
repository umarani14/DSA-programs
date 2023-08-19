package com.twopointer;

import java.util.Arrays;

public class MajorityElement {
	
	public static void main(String[] args) {
		int[] nums= {2,2,1,1,1,2,2};
		System.out.println("majority of elements are- "+majorityElement(nums));
//		majorityElement(nums);
	}
	
	 static int majorityElement(int[] nums) {
	      int left=0,right=1;
	      int len=nums.length;
	      int count=1;
	      Arrays.sort(nums);
	      
	      while(right<len) {
	      if(nums[left]==nums[right]) {
	    	  count++;
	    	  if(count>len/2) {
	    		  return nums[left];
	    	  }
	    	  right++;
	      }else {
	      left++;
	      right++;
	      }
	      }
		return nums[0];
	    }

}
