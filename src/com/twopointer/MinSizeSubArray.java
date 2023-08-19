package com.twopointer;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 */
public class MinSizeSubArray {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 2, 4, 3, 7 };
		int target = 7;
		minSubArray(target, nums);
	}

	static int minSubArray(int target, int[] nums) {
//		sliding window
		int left = 0;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int right = 0; right <= nums.length - 1; right++) {
			sum = sum + nums[right];
			while (sum >= target) {
				min = Math.min(min, right + 1-left);
				sum = sum - nums[left];
				left++;
			}

		}
		return min != Integer.MAX_VALUE ? min : 0;
	}

	static int minSubArrayLen(int target, int[] nums) {
		int left = 0, right = nums.length - 1;
		int min = Integer.MAX_VALUE;
		ArrayList<Integer> list = new ArrayList<>();
		int sum = nums[left];
		list.add(sum);

		while (left < right) {
			if (sum == target || sum > target) {
				min = Math.min(sum, list.size());
				System.out.println(" min is--- " + min);
				left++;
				sum = nums[left];
				ArrayList<Integer> list1 = new ArrayList<>();
				list1.add(sum);
			}
			if (sum < target) {
				sum = sum + nums[right];
				list.add(nums[right]);
				System.out.println(" sum is-- " + sum);
				right--;
			}
		}
		return min;
	}

}
