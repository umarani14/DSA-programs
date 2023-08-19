package com.twopointer;

public class ShiftelementsToRight {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7}; //output : 5 6 7 1 2 3 4
//		  for(int i=0;i<=nums.length-1;i++) {
//	        	System.out.println(nums[i]);
//	        }
		int k=3;
//		System.out.println(rotate(nums, k));
		rotate(nums, k);
	}
public static void rotate(int[] nums, int k) {
//        int left=0,right=nums.length-1;
//        for(int i=0;i<=3;i++) {
//        	int temp=nums[right];
//        	for(int j=right;j>0;j--) {
//        		nums[j]=nums[j-1];
//        	}
//        	nums[left]=temp;
//        }
//        for(int i=0;i<=right;i++) {
//        	System.out.println(nums[i]);
//        } 
	
	 int n = nums.length;
     int[] rotated = new int[n];
     for (int i = 0; i <n; i++) {
//    	 System.out.println((i + k) % n);
         rotated[(i + k) % n] = nums[i];
     }
     for (int i = 0; i < n; i++) {
         nums[i] = rotated[i];
     }
   for(int i=0;i<=nums.length-1;i++) {
 	System.out.println(nums[i]);
 } 
    }

}
