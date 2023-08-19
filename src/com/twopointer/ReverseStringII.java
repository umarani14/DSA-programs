package com.twopointer;

public class ReverseStringII {

	public static void main(String[] args) {
		String s= "uma  raju yokshith";
		revString(s);
	}
	
	static String revString(String s) {
		String[] sWords=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=sWords.length-1;i>=0;i--) {
			System.out.println("length of word is-- "+ sWords[i].length());
			if(sWords[i].length()>1) {
			sb.append(sWords[i]);
			sb.append(" ");
			}
		}
		System.out.println(" rev words are-- "+ sb.toString().trim());
		return sb.toString().trim();
		
	}
}
