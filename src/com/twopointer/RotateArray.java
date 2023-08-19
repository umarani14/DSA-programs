package com.twopointer;

public class RotateArray {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k=3;
		int[] afterroatationnums=rotateElements(nums, k);
		for(int i=0;i<=afterroatationnums.length-1;i++) {
			System.out.println(afterroatationnums[i]);
		}
		
	}
	private static int[] rotateElements(int[] nums,int k) {
				for(int i=0;i<k;i++) {
				int left=0;
				int right=1;
				int length=nums.length-1;
			while(right<=length) {
				int temp=nums[right];
				nums[right]=nums[left];
				nums[left]=temp;
				right++;
			}
			}
			return nums;
	}

}
