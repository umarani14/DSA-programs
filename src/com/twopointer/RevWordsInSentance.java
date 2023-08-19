package com.twopointer;

public class RevWordsInSentance {
	
	public static void main(String[] args) {
		String s="Let's take LeetCode contest";
	
		revWords( s);
	}

	private static void revWords(String s) {
		String split[]=s.split(" ");

		for(int i=0;i<=split.length-1;i++) {
			int left=0,right=split[i].length()-1;
			if(split[right]==" ") {
				right++;
				left=right;
			
			}
		}
	}

}
