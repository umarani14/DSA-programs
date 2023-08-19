package com.twopointer;
/*
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array 
 * represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 
 */
public class CanJump {
	public static void main(String[] args) {
		int[] nums= {3,2,1,1,4};
//		canJump(nums);
//		System.out.println("can jump--"+ abc(nums));
		abc(nums);
	}
	
	static int canJump(int[] nums) {
		int length=nums.length;
		int max_reach=0;
		int count=0;
		int currentPosition=0;
		for(int i=0;i<length-1;i++) {
			max_reach=Math.max(max_reach, i+nums[i]);
			if(i==currentPosition) {
				currentPosition=max_reach;
				count++;
			}
		}
		System.out.println("count is--"+ count);
		return count;
	}
	
	static boolean abc(int[] nums) {
		int boundary = 0;
	     for(int i =0;i<=boundary;i++){
	         boundary = Math.max(boundary,i+nums[i]);
	         if(boundary >=nums.length-1)
	         return true;
	     } 
	     return false;
	    }

}
