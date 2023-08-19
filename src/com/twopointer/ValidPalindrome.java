package com.twopointer;

public class ValidPalindrome {
	public static void main(String[] args) {
		String  s = "A man, a plan, a canal: Panama";
		System.out.println(" is palindrome-- "+ validPalindrome(s));
//		validPalindrome(s);
	}
//	code to remove all charaters and keep only alpabets in the string
//	for(int i=0;i<=ch.length-1;i++) {
//	if(ch[i]>=64 && ch[i]<=122) {
//		result=result+ch[i];
//	}
//}
	static boolean validPalindrome(String s) {
		String str=s.toLowerCase();
		char[] ch=str.toCharArray();
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		int left=0,right=str.length()-1;
		while(left<=right) {
			if(str.charAt(left)==str.charAt(right)) {
				right--;
				left++;
			}else {
				return false;
			}
		}
		return true;
	}

}
