package com.twopointer;

public class ShiftZeros {
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,4,5,6,7};
		int[] n=rotateElements(nums);
		for(int i=0;i<=n.length-1;i++) {
			System.out.println(n[i]);
		}
	}
	private static int[] rotateElements(int[] nums) {
		int left=0;
		int right=1;
		while(right<nums.length) {
			if(nums[right]!=0) {
			nums[left]=nums[right];
			nums[right]=0;
			right++;
			left++;
		}
			else
				right++;
		}
return nums;

}
}
