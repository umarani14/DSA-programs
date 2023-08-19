package com.Math;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
	public static void main(String[] args) {
		int[] n= {1,9};
		plusOne1(n);
	}
	static int[] plusOne1(int[] digits) {
		int length=digits.length;
		for(int i=length-1;i>=0;i--) {
		if(digits[i]<9) {
			digits[i]++;
			return digits;
		}
		digits[i]=0;
		}
		int[] newInt=new int[length+1];
		newInt[0]=1;
		return newInt;
	}
	
	
	static int[] plusOne(int[] digits) {
	     int length=digits.length;
	    
	     digits[length-1]++;
	     List<Integer> list=new ArrayList<>();
	    
	     if(digits[length-1]>9) {
	    	list.add(digits[length-1]); 
	     }
	     for (int i = 0; i < digits.length; i++) {
				System.out.println(" digits in for loop");
			}
	     return digits;
	    }

}
