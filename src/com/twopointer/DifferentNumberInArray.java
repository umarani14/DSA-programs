package com.twopointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Given an array arr of unique nonnegative integers, 
 * implement a function getDifferentNumber that finds the smallest nonnegative integer that is NOT in the array.
 */
public class DifferentNumberInArray {

	public static void main(String[] args) {
		int[] arr= {0,1,2,4,5};
		
		System.out.println(" using set-- "+ getDiffNumUsingSet(arr));
		System.out.println(" when elements start from 0 : "+getDifferentNumber(arr));
//		getDifferentNumber(arr);
		System.out.println(" when elemetnts start from 1 : "+getDiffNum(arr));
	}
	 static int getDifferentNumber(int[] arr) {

		 int length=arr.length-1;
		 Arrays.sort(arr);
		 for (int i = 0; i < arr.length; i++) {
			 if(arr[i]!=i) {
				 return i;
			 }
		}
		 
		 return length;
		  }
//	 using SET
	 
	 static int getDiffNumUsingSet(int[] arr) {
		 
		 int length=arr.length;
		 Set set=new HashSet<>();
		 for(int a:arr){
			 set.add(a);
		 }
		 
		 for(int i=0;i<length;i++) {
			 if(!set.contains(i)) {
				 return i;
			 }
		 }
		 
		 return length;
	 }
	 
	 static int getDiffNum(int[] arr) {
		//check if the integers are consicutive or not n- n-1==1 concicutive
//		 n+1=arr[n+1] continue, else return n+1
//		 1,3,5,6
//		 1 2 3 5
		 for (int i = 0; i < arr.length; i++) {
			if(arr[i]+1==arr[i+1]) {
			continue;
		}
			return arr[i]+1;
		 }
		return arr.length+1;
	 }
}
