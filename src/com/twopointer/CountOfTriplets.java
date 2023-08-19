
package com.twopointer;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 
Given a list of numbers, count the number of triplets having a sum less than a given target.
Example :
{
“target” : 4,
“numbers”: [5, 0, -1, 3, 2]

}
 */
public class CountOfTriplets {

	public static void main(String[] args) {
		int[] nums = { 2, 0, 3, -1, 1, 6 };
		int target = 6;
		Integer count = 0;

//		ArrayList<Integer> num = slidingWindow(nums, target, count);
//		System.out.println(num);
		count(nums, target);
//		System.out.println(num.size());
	}

	private static void count(int[] nums, int target) {
		int count = 0; // [5,0,-1,3,2]
		Arrays.sort(nums);
		for (int left = 0; left <= nums.length - 1; left++) {
			int sum = nums[left];
			for (int right = nums.length - 1; right > left; right--) {
				sum = sum + nums[right] + nums[right - 1];
				if (sum < target) {
					count++;
				}
				sum = nums[left];
			}
		}
		System.out.println(count);
	}

	private static ArrayList<Integer> slidingWindow(int[] nums, int target, Integer count) {
		ArrayList list1 = new ArrayList();
//		first step is to calculate k digits in array
		int k = 3;
		int sum = 0;
		int[] a = new int[3];
		for (int i = 0; i < k; i++) {
			sum = sum + nums[i];
		}
		if (sum < target) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(nums[0]);
			list.add(nums[1]);
			list.add(nums[2]);
			list1.add(list);
//			System.out.println(""+ a[0]+ ","+ a[1]+ ","+ a[2]);
			count++;
		}
//	use sliding window technique 
//	 use above sum and add next element from array and substract previous(i-1) element
		for (int i = k; i <= nums.length - 1; i++) { // [5,0,-1,3,2]
			int new_sum = sum + nums[i] - nums[i - k];
			ArrayList newlist = new ArrayList();
			if (new_sum < target) {
				newlist.add(nums[(i - k) + 1]);
				newlist.add(nums[(i - k) + 2]);
				newlist.add(nums[(i - k) + 3]);
				list1.add(newlist);
				count++;
			}
			sum = new_sum;
		}
		return list1;
//	 input {2, 0, 3 , -1, 1, 6};
//	target=6;
	}

}
