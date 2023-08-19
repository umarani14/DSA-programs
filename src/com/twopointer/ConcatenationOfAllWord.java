package com.twopointer;

import java.util.ArrayList;
import java.util.List;

public class ConcatenationOfAllWord {

	public static void main(String[] args) {
		String s = "barfoothefoobarman";
		String[] words = {"foo","bar"};
		
		findSubstring(s, words);
	}
	
	 static List<Integer> findSubstring(String s, String[] words) {
	        List<Integer> list=new ArrayList<>();
	        
	        int length=s.length();
	        int wordSize=words[0].length();
	        
	        int subStringLength=length*wordSize;
	        
	        for(int i=0;i<length;i++) {
	        	int index=s.indexOf(words[0]);
	        	if(s.charAt(i)==words[i].charAt(i)) {
	        		System.out.println(" same ");
	        	}
	        	
	        	
	        	System.out.println("index is-- "+ index );
	        }
		 
		 return null;
	    }
}
