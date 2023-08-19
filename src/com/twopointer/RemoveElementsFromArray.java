package com.twopointer;

import java.util.Arrays;
/*
 * Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public  class RemoveElementsFromArray {

	public static void main(String[] args) {
		int[] nums= {0,1,2,2,3,0,4,2};
		int target=2;
//		removeArray(nums, target);
//		removeE(nums, target);
		BestSolution(nums, target);
//		removeEle(nums, target);
		
	}

	static int BestSolution(int[] n,int t) {
		int count=0;
		for(int i=0;i<=n.length-1;i++) {
			if(n[i]!=t) {
				n[count]=n[i];
				count++;
			}
		}
		System.out.println("count is--"+count);
return count;
	}

	private static void removeE(int[] n,int t) {
	int left=0,right=n.length-1;
	int count=n.length;
	while(left<=right) {
	if(n[left]==t) {
		if(n[right]==t) {
			right--;
		}
		int temp=n[right];
		n[right]=n[left];
		n[left]=temp;
		left++;
		right--;
//		count++;
	}
	else {
		count--;
		left++;
	}
	}
	System.out.println("count is--"+ count);
	}
	
	
	static int removeEle(int[] n,int target) {
		int right=1,left=0;
		int count=0;
		while(left<=n.length-1) {
			if(n[left]==target && n[right]!=target) {
				int temp=n[left];
				n[left]=n[right];
				n[right]=temp;
				left++;
				right++;
				count++;
			}else {
				left++;
			}
		}
		System.out.println("count is-"+count);
		return count;
	}
	private static int removeArray(int[] nums,int target) {
		int left=0;
		int l=nums.length;
		int right=l-1;
		 int[] newNums = new int[l];
		 int count= 0;		//{0,1,2,2,3,0,4,2};
			while(left<right) {
				if(nums[right]!=target) {
					int temp=nums[right];
				nums[right]=nums[left];
				nums[left]=temp;
				right--;
				left++;
//				count--;
			}
				else
					right--;
				count++;
			}

		for(int i=0;i<=nums.length-1;i++) {
		System.out.println("after moving target to last-"+nums[i]);
		}
		System.out.println("Count is-"+count);
		return count;
	}
	
}
