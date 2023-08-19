package com.twopointer;

/*
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

 */
public class LongestOnes {
	
	public static void main(String[] args) {
		int[] nums= {1,1,1,0,0,0,1,1,1,1,0};
		int k=2;
		longestOnes(nums, k);
	}
	
	static int longestOnes(int nums[],int k) {
		int left=0,right=0,count=0;
		
		int length=nums.length;
		
		while(right<length) {
			if(nums[right]==0) {
				count++;
			}
			right++;
			if(count>k) {
				if(nums[left]==0) {
					count--;
				}
				left++;
			}
		}
		System.out.println(" length is-- "+ (right-left));
		return right-left;
	}

}
