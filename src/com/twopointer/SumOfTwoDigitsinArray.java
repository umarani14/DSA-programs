
package com.twopointer;

import java.util.ArrayList;

public class SumOfTwoDigitsinArray {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,9};
		int target=9;
		int[] abc=addTwoNumbers(nums, target);
		if(abc!=null) {
			System.out.println(abc[0]+ " "+ abc[1]);
		}
//		System.out.println(addTwoNumbers(nums, target));
//		a[i]+b[j]-x=min
//		int n=a.length-1,m=b.length-1;
//		int diff= Integer.MAX_VALUE;
//		int[] result=new int[2];
//		int i=0,j=m;
//		while(i>=0 && j<m) {
//			if(a[i]+b[j]==x) {
//				result[0]=a[i];
//				result[1]=b[j];
//				return result;
//			}else if(a[i]+b[j]<x) {
//				321qewdscx2
//				
//			}
//		}
////		
//		return 0;
		
		
	}
	private static int[] addTwoNumbers(int[] nums,int target) {
	int i=0,j=nums.length-1;
	ArrayList<Integer> list=new ArrayList<>();
	while(i<=j) {
		if(nums[i]+nums[j]==target) {
			list.add(i);
			list.add(j);
			int[] vals= new int[2];
			vals[0]=i;
			vals[1]=j;
			return vals ;
		}else if(nums[i]+nums[j]>target) {
			j--;
		}else if(nums[i]+nums[j]<target) {
			i++;
		}
	}
	return null;
	
}
}
