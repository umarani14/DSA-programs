package com.twopointer;

public class LongestSubarray {
	
	public static void main(String[] args) {
		int[] nums= {1,1,0,1,0};
		longestSubarray(nums);
	}
	
	static int longestSubarray(int[] nums) {
     int left=0,right=0,zeroes=0;
     int max=0;
     int length=nums.length;
     while(right<length) {
    	if(nums[right]==0) {
    		zeroes++;
    	}
    	right++;
    	if(zeroes>1) {
    		if(nums[left]==0) {
    			zeroes--;
    		}
    		left++;
    	}
    	max=Math.max(max, (right-left-1));
    	System.out.println(" max value in loop is--"+ max);
     }
		System.out.println(" max outside loop is -- "+ max);
		return max;
    }

}
