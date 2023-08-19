package com.twopointer;

import java.util.Arrays;

/*
 * Given two strings a and b consisting of lowercase characters. 
 * The task is to check whether two given strings are an anagram of each other or not.
 *  An anagram of a string is another string that contains the same characters, only the order of characters can be different.
 *   For example, act and tac are an anagram of each other.
 */
public class Anangram {
	public static void main(String[] args) {
		String s1="ab",s2="eidbaooo";
		isAnagram(s1, s2);
		System.out.println(isAnagram(s1, s2));
	}
	 //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
    	if(a.length()==b.length()) {
    		char[] aChar=a.toCharArray();
    		char[] bChar=b.toCharArray();
    		Arrays.sort(aChar);
    		Arrays.sort(bChar);
    		if(Arrays.equals(aChar, bChar)) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	}else {
    		return false;
    	}
    }

}
