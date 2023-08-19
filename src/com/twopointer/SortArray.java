package com.twopointer;

public class SortArray {
	public static void main(String[] args) {
//		 two arrays
		int A[]= {1,2,4,5,6};
		int[] b= {3,7};
		System.out.println(sortArray(A, b));
	}
	private static boolean sortArray(int[] a, int[] b) {
		boolean flag=true;
		int prev=-1;
		int i=0,j=0;
		int aSize=a.length-1, bSize=b.length-1;
		while(i<=aSize && i<=bSize) {
			if(a[i]<b[j]&& prev!=0) {
				i++;
				prev=0;
			}
			else if(b[j]<a[i]&& prev!=1) {
				j++;
				prev=1;
			}
			else if(a[i]==b[j]) {
				if(prev!=0) {
				i++;
				prev=0;
			}
			 if( prev!=1) {
				j++;
				prev=1;
			 }
			}else {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
