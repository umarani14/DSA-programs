package com.twopointer;

public class FindSumofTwoIntegersInArray {
	public static void main(String[] args) {
		int[] nums= {20,6,10,10};
		int k=3;
		System.out.println(sumOfIntegers(nums,k));
		sumOfIntegers(nums,k);
		twoPointer(nums, k);
		slidingWindow(nums, k);
	}

	private static int sumOfIntegers(int[] nums, int k) {
		int max=Integer.MIN_VALUE;
		int sum=0;
		int current_max=0;
		for(int i=0;i<=nums.length-1;i++) {	
			for(int j=i+1;j<=nums.length-1;j++) {
				sum=nums[i]+nums[j];	
				current_max=max;
				max=Math.max(current_max, sum);
			}	
		}
		return max;
		
	}
	
	private static void twoPointer(int[] nums,int k) {
		int left=0,right=nums.length-1;
		int sum=0;
		int max=Integer.MIN_VALUE;
		int current_max=0;
		while(left<=right) {
			sum=nums[left]+nums[right];
			current_max=max;
			max=Math.max(current_max, sum);
			right--;
			left++;
		}
		System.out.println(max);
	}
	
	private static void slidingWindow(int[] nums,int k) {
		int sum=0;
		int sum_max=0;
		int max = 0;
		for(int i=0;i<k;i++) {
			sum=sum+nums[i];
		}
		System.out.println(sum);
		for(int i=k;i<=nums.length-1;i++) {
			sum_max=sum+nums[i]-nums[i-k];
			max=Math.max(sum_max, sum);
			sum=max;
		}
		System.out.println(max);
	}
}
