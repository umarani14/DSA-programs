package com.stack;

import java.util.Stack;

public class SimplyfyPath {

	public static void main(String[] args) {
		String path = "/home//foo/";
		simplifyPath(path);
	}

	static String simplifyPath(String s) {
		String[] newS = s.split("/");
		Stack<String> stack = new Stack();
		for (String s1 : newS) {
			System.out.println(" string after splitting is - " + s1);

			if (stack.isEmpty()) {
				stack.push("/");
			} else {
				if (!stack.isEmpty() && s1.equals("..")) {
					stack.pop();
				} else if (!s1.equals(".") && !s1.equals("..") && !s1.equals("")) {
					stack.push(s1);
				}
			}
		}
		System.out.println(" stack is- " + stack);
		String sb=new String();
		for(int i=0;i<stack.size();i++) {
			sb=sb+"/"+stack.pop();
		}
		System.out.println(" string is "+ sb);
		return null;
	}

}
