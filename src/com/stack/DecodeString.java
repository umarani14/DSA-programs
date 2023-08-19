package com.stack;

import java.util.Stack;

public class DecodeString {
	
	public static void main(String[] args) {
		String s="3[a]2[bc]";
		
		decodeString(s);
	}
	
	static String decodeString(String s) {
		char[] ch=s.toCharArray();
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			System.out.println(" char are -- "+ ch[i]);
			stack.push(ch[i]);
//			if(ch[i]==)
//			stack.
			
		}
		System.out.println(" stack -- "+ stack.peek());
		
		return null;
	}

}
