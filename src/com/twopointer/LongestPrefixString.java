package com.twopointer;

import java.util.Arrays;

public class LongestPrefixString {

//	Write a function to find the longest common prefix string amongst an array of strings.
//
//	If there is no common prefix, return an empty string ""
//
//	Example :
//
//	Input: strs = ["flower","flow","flight"]
//	Output: "fl"
	
	public static void main(String[] args) {
		String[] strings= {"reflower","flow","flight"};
		longPreFix(strings);
//		longestPrefix(strings);
	}
	
	static String longPreFix(String[] strings) {
		Arrays.sort(strings);
		
		String s1=strings[0];
		String s2=strings[strings.length-1];
		int index=0;
		while(index< s1.length() && index <s2.length()) {
			if(s1.charAt(index)==s2.charAt(index)) {
				index++;
			}else {
				break;
			}
		}
		System.out.println(" longest substring is---"+ s1.substring(0,index));
		return s1.substring(0, index);
		}
	
	
//	not satisfying all test cases
	private static String longestPrefix(String[] strings) {
		Arrays.sort(strings);
		String longestPrefix=strings[0];
		
		for(int i=1;i<=strings.length-1;i++) {
			while(longestPrefix.length()>=0) {
				if(strings[i].indexOf(longestPrefix)==-1) {
					longestPrefix=longestPrefix.substring(0,longestPrefix.length()-1 );
				}else {
					break;
				}
			}
		}
		System.out.println("longest prefix is - "+ longestPrefix);
		return longestPrefix;
	}
	
	
	
	
	
}
