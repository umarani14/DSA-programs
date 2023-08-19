package com.twopointer;

public class MaxSubArray {
	
	public static void main(String[] args) {
		int[] nums = {1,12,-5,-6,50,3}; int k = 4;
		
		findMaxAverage(nums, k);
	}
	
	static double findMaxAverage(int[] nums, int k) {
        int length=nums.length;
        int sum=0;   
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int sum1=0;
        int max=sum;
        for(int i=k;i<length;i++){
            sum1=sum1+nums[i]-nums[i-k];
            max=Math.max(max,sum1);
        }
        System.out.println(" max/k value is-- "+ (double)(max/k));
        return (double)max/k;
    }

}
