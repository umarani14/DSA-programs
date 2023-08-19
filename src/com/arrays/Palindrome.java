package com.arrays;

public class Palindrome {
	public static void main(String[] args) {
		String name="ABCDCBA";
		palindrome(name);
	}
	
	public static boolean palindrome(String name) {
		int left=0,length=name.length(),right=length-1;
		char[] ch=name.toCharArray();
		while(left<right) {
			if(ch[left]==ch[right]) {
				left++;
				right--;
			}else {
				System.out.println("false");
				return false;
			}
		}
		System.out.println("true");
		return true;
	}

}
