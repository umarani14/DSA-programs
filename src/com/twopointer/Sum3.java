package com.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3 {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		System.out.println(" list of subArrays are--" + threeSum(nums));
	}

	static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> set = new HashSet();
		int left = 0, length = nums.length - 1;
		int sum = 0;
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			for (int j = i + 1, k = length; j < k;) {
				sum = nums[i] + nums[j] + nums[k];
				if (sum == 0) {
					List newList = new ArrayList<>();
					newList.add(Arrays.asList(nums[i], nums[j], nums[k]));
					set.addAll(newList);
					while (j < k && nums[j] == nums[j + 1]) {
						j++;
					}
					while (j < k && nums[k] == nums[k - 1]) {
						k--;
					}
					j++;
					k--;
				} else if (sum > 0) {
					k--;
				} else if (sum < 0) {
					j++;
				}
			}
		}
		list.addAll(set);

		return list;

	}

}
