package com.arrays;

import java.util.Arrays;

public class SumOfDigits {
	public static void main(String[] args) {
	int num=687;
	int sum=sumOfDigits(num);
	System.out.println(" sum is "+ sum);
	int[] nums= {7,10,4,3,3,20,15};
	int k=3;
	sumOfArrayElements(nums);
	findMinAndMax(nums);
//	findMinMax(nums);
	kthMinMax(nums, k);
	countOfElements(nums, k);
	}

	private static int sumOfDigits(int num) {
		int sum=0;
		while(num>0) {
		int r=num%10;
		sum=sum+r;
		int q=num/10;
		num=q;
		sumOfDigits(num);
		}
//		System.out.println(" sum is "+ sum);
		return sum;
	}
	private static void sumOfArrayElements(int[] arr) {
		int sum=0;
		int left=0,length=arr.length,right=length-1;
		while(left<length) {
			sum=sum+arr[left];
			left++;
		}
		System.out.println(" sum "+ sum);
	}
	
	private static void findMinAndMax(int[] num) {
		int min=Integer.MAX_VALUE;
		int max=0;
		int left=0,length=num.length;
		while(left<length) {
			min=Math.min(min, num[left]);
			max=Math.max(max, num[left]);
			left++;
		}
		System.out.println("min is " + min);
		System.out.println("max is "+max);
	}
	
//	private static void findMinMax(int[] num) {
//		Arrays.sort(num);
//		int min = Integer.MAX_VALUE;
//		int max=0;
//		for(int i=0;i<num.length;i++) {
//			 min=num[0];
//			 max=num[num.length];
//		}
//		System.out.println("min "+ min);
//		System.out.println("max is "+ max);
//		
//	}
	
	private static int kthMinMax(int[] arr,int k) {
//		7,10,4,3,20,15
		Arrays.sort(arr);
		int a=arr[k-1];
		System.out.println(" without loop "+ arr[k-1]);
//		for(int i=1;i<=k;i++) {
//			a=arr[i-1];
//		}
		System.out.println(" kth min element is-"+ a);
		return a;
	}
	
	private static int countOfElements(int[] arr,int k) {
		int length=arr.length;
		int count=0;
		for(int i=0;i<=length-1;i++) {
			if(arr[i]==k) {
				count++;
			}
		}
		System.out.println(" count is "+ count);
		return count;
	}

}
