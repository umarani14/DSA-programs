package com.twopointer;

/*
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */
public class ProductOfArrayExceptItself {
	public static void main(String[] args) {
		int nums[] = {1,2,3,4};
//		productArray(nums);
		int a[]=productofArrayExceptItself(nums);
		
		for(int i=0;i<=3;i++) {
			System.out.println(" result is-- "+ a[i]);
		}
	}
//	product of all elements
	static void productArray(int[] nums) {
		int product=1;
		int[] result=new int[4];
		
		for(int i=0;i<=nums.length-1;i++) {
			product=product*nums[i];
			System.out.println(" result is-- "+ product);
		}
	}
	
	static int[] productofArrayExceptItself(int[] nums) {
		int[] result =new int[nums.length];
		int prefix=1;
		int suffix=1;
		for(int i=0;i<=nums.length-1;i++) {
			result[i]=suffix;
			suffix=suffix*nums[i];
		}
		
		for(int i=nums.length-1;i>=0;i--) {
			result[i]=result[i]*prefix;
			prefix=prefix*nums[i];
		}
		
		return result;
	}

}
