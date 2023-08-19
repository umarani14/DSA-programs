package com.twopointer;

/*
 * Given a string s, return the longest 
palindromic
 
substring
 in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
 */
public class LongestPalindromeString {
	public static void main(String[] args) {

		String s="babad";
		longestPalindromeString(s);
	}

	static String longestPalindromeString(String s) {
		char[] ch=s.toCharArray();
		int left=0;
		int right=s.length()-1;
		StringBuilder sb=new StringBuilder();
		int position=0;
		while(left<=right) {
			if(ch[left]==ch[right]) {
				sb.append(ch[left]);
				left++;
				right--;
			}else {
				right--;
			}
		}
		System.out.println("Palindrome String is-"+ sb.toString());
		System.out.println("substring is--"+ s);
		return sb.toString();
	}
}
