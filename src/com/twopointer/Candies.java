package com.twopointer;

import java.util.Arrays;

/*
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.
 * 
 */
public class Candies {
	
	public static void main(String[] args) {
		int[] ratings= {1,2,87,87,87,2,1};
//		candy(ratings);
		candiesIncreasing(ratings);
	}
//	when ratings are not in order
	static int candiesIncreasing(int[] ratings) {
		int n=ratings.length;
		System.out.println(" length is-- "+ n);
		int[] candies=new int[n];
		Arrays.fill(candies, 1);
		for(int i=1;i<n;i++) {
			if(ratings[i]>ratings[i-1]) {
				candies[i]=candies[i-1]+1;
			}
		}
		for(int i=n-2;i>=0;i--) {
			if(ratings[i]>ratings[i+1] && candies[i]<=candies[i+1]) {
				candies[i]=candies[i+1]+1;
			}
			System.out.println(" candies -- "+ candies[i]);
		}
		
		
		int candiesLength=0;
		for(int i=0;i<n;i++) {
			candiesLength=candiesLength+candies[i];
		}
		System.out.println(" candies length-- "+ candiesLength);
		return candiesLength;
	}
	
//	below code works when there are increasing nums in the array. 
	static int candy(int[] ratings) {
		int length = ratings.length ;
		int left = 0;
		int right = 1;
		int candies = 0;
		int total = length;
		while (right < length) {
			if (ratings[left]> ratings[right] ) {
				total = total + 1;
			} else
				if( ratings[right]> ratings[left]) {
				total=total+1;
			}
			left++;
			right++;
		}
		System.out.println(" total is -- " + total);
		return total;
	}

}
