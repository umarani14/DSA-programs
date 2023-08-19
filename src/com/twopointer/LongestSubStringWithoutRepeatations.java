package com.twopointer;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatations {
	
	public static void main(String[] args) {
		String s = "abcdabcbb";
		lengthOfLongestSubstring(s);
	}

	static int lengthOfLongestSubstring(String s) {
		int left=0,right=0;
		int length=s.length()-1;
		int count=0;
		HashSet set=new HashSet<>();
		char[] ch=s.toCharArray();
//		set.add(ch[left]);
		while(right<length) {
//			set.add(ch[right]);
			if(!set.contains(ch[right])) {
				set.add(ch[right]);
				count=Math.max(count, set.size());
				right++;
			}else {
				set.remove(ch[left]);
				left++;
			}
		}
		System.out.println(" count is-- "+ count);
		return count;
		
	}
}
