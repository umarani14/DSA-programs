package com.twopointer;

import java.util.HashSet;
/*
 * 
Given a string s, find the total unique chars in s
 */


public class LongestSubString {
	
	public static void main(String[] args) {
		String s = "pwwkew";	
	System.out.println(subString(s));
	}
	
	private static int subString(String s) {
		char[] ch= s.toCharArray();
		HashSet set=new HashSet<>();		
		int left=0;
		int right=0;
		int max = 0;
		while(right<=s.length()-1) {
			if(!set.contains(ch[right])) {
				set.add(ch[right]);
				max=Math.max(max, set.size());
				right++;
			}else {
				set.removeAll(set);
				set.add(ch[right]);			
				right++;
			}
		}
		System.out.println(set);
		return max;
	}

}
