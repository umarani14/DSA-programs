package com.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = { 100, 4, 200, 1, 3, 2 };
		System.out.println(" consecutive nums -- "+ consecutiveNumbers(nums));
//		consecutiveNumbers(nums);
	}

	static int consecutiveNumbers(int[] nums) {
		Arrays.sort(nums);
		int count = 1;
		int max = 1;
		if (nums.length == 0) {
			return 0;
		}
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i + 1] - nums[i] == 1) {
				count++;
				max = Math.max(max, count);
			} else if (nums[i + 1] == nums[i]) {
				continue;
			} else {
				count = 1;
			}
		}
		return max;
	}

}
