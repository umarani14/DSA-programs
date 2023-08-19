package com.stack;

import java.util.Stack;

public class RemoveStars {
	
	public static void main(String[] args) {
		String s="leet**cod*e";
		removeStar(s);
		
	}
	
//	using stack data structure
	static String removeStars(String s) {
		Stack<Character> stack=new Stack<>();
		int left=0;
		int length=s.length();
		char[] ch=s.toCharArray();
		StringBuffer sb=new StringBuffer();
		while(left<length) {
			if(ch[left]!='*') {
				stack.push(ch[left]);
				left++;
			}else {
				stack.pop();
				left++;
			}
		}
		System.out.println(" stack is-- "+ stack);
		while(!stack.isEmpty()) {
			sb.insert(0, stack.pop());
		}		
		System.out.println(" stack to string -- "+ sb.toString());
		return s;
        
    }
	
//	without using stack
	
	static String removeStar(String s) {
		StringBuilder sb=new StringBuilder();
		for(char c: s.toCharArray()) {
			if(c=='*') {
				sb.deleteCharAt(sb.length()-1);
			}
			else {
				sb.append(c);
			}
		}
		System.out.println(" sb is "+ sb);
		return sb.toString();
	}


}
