package com.twopointer;

import java.util.Iterator;

public class LengthOfLastString {
	public static void main(String[] args) {

		String s = "luffy is still joyboy";
		String[] sNew=s.split(" ");
		System.out.println("length is--"+lastString(s) );
//		lastString(s);
		
	}
	
	static int lastString(String s) {
		
		int sLast=s.lastIndexOf(" ");
		System.out.println("last index is-- "+ sLast);
		String[] sNew=s.split(" ");
		int length=sNew.length;
		int left=length;
		while(left==length) {
			left--;
			return sNew[left].length();
			
		}
		return 0;
	}
}
