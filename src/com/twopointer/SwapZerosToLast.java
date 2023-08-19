package com.twopointer;

public class SwapZerosToLast {
	public static void main(String[] args) {
		int[] a= {1,0,12,13,0,14};
		int[] b= {0,1,1,0,0,4};
		swapZeroToBack(a);
//		swapZeroToFront(b);
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
//			System.out.println(b[i]);
		}
	}
	private static void swapZeroToBack(int[] a) {
		int i=0;
		int length=a.length-1;
		int right=0,left=0;
		int temp = 0;
		while(right<=length) {
			if(a[right]!=0) {
				temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right++;
			}else {
				right++;
			}
		}	
	}
	
	private static void swapZeroToFront(int[] a) {
		int i=0; //{0,1,1,0,0,4}
		int length=a.length-1;
		int right=a.length-1,left=a.length-1;
		int temp = 0;
		while(right>=0) {
			if(a[right]!=0) {
				temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				right--;
				left--;
			}else {
				right--;
			}
		}
		
	}
}
