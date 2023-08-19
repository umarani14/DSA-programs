package com.twopointer;


public class CompressWords {
	
	public static void main(String[] args) {
		char[] ch= {'a','b','c'};
		
		compress(ch);
	}
	
	static int compress1(char[] chars) {
		char previousChar;
		int start=0;
		int left=0,right=0;
		int length=chars.length;
		int count=0;
		
		for(int i=0;i<length;i++) {
			
		}
		
		
		return 0;
	}
	
	static  int compress(char[] chars) {

		char previousChar;
		int start=0;
		int left=0,right=0;
		int length=chars.length;
		int count=0;
		while(right<length) {
			previousChar=chars[left];
			if(chars[right]==previousChar) {
				count++;
			}
			if(chars[right]!=previousChar) {
				
				chars[start]=previousChar;
				start++;
				if(right==length ) {
					chars[start]=chars[right];
				}
				if(count>1) {
					for(char c: Integer.toString(count).toCharArray()) {
						chars[start]=c;
						start++;
					}
					count=1;
				}
				left=right;
			}
			right++;
		}
		System.out.println(" start is -- "+ start);
		return start;
	}

}
