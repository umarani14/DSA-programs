package com.twopointer;
/*
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the 
 * ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
 */
public class CapacityOfWater {
	
	public static void main(String[] args) {
		int[] height= {1,1};
//		maxCapaticy(height);
		System.out.println(" max capacity is- "+ maxCapaticy(height));
	}
	
	static int maxCapaticy(int[] height) {
	      
			int left=0;
			int right=height.length-1;
			int max=0;
			int capacity=0;
			int min=Integer.MIN_VALUE;
			while(left<right) {
				min=Math.min(height[left], height[right]);
				capacity=min*(right-left);
				max=Math.max(capacity, max);
				if(height[left]<height[right]) {
					left++;
				}else {
					right--;
				}
			}
			return max;
	}

}
