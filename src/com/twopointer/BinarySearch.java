package com.twopointer;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums= {-1,0,3,5,9,12};
		int target = 9;
		int val=search(nums, target);
		System.out.println("index position is-"+val);
	}
	 public static int search(int[] nums, int target) {
		 int low=0;
		
		 int high=nums.length-1;
//		 int mid=nums.length/2;
		 
		 while(low<high) {
			   // if we calculate mid=nums.length/2 then low and highs keep changing dont do this
//			 instead calculate mid value using lows and highs value
			 int mid=low+(high-low)/2;
			 
			 System.out.println(mid);
			 System.out.println(nums[mid]);
			 if(nums[mid]==target) {
				 return mid;
			 }else if(nums[mid]<target) {
				 low=mid+1;
			 }else {
				 high=mid-1;
			 }
		 }
		 
		return 0; 
	 }
}
