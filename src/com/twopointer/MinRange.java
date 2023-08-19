package com.twopointer;
//Given two sorted arrays and a number x, find the pair whose sum is closest to x and the pair has an element from each array
public class MinRange {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4},b= {10,20,30,40};
		int x=44;
		closestPair(a, b, x);
		
	}
	
	private static void closestPair(int[] a,int[] b,int x) {
		int left=a.length,right=b.length;
//		what happens when we don't initialize, it will throw error and gets 0 assigned but we want max to be in diff
		int diff=Integer.MAX_VALUE;
		int l=0,r=right-1;
		int res_l=0,res_r=0;
		while(l<left && r>=0) {
			if(Math.abs(a[l]+b[r]-x)<diff) {
				res_l=l;
				res_r=r;
				diff=Math.abs(a[l]+b[r]-x);
			}
			if(a[l]+b[r]>x) {
				r--;
			}else
				l++;
		}
		System.out.println(a[res_l] + " "+b[res_r] );

	}

}
