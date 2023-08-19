package com.Strings;

public class MergeAlternateChars {

	public static void main(String[] args) {
		String word1 = "ab", word2 = "pqr";
		mergeAlternately(word1, word2);
	}
	
	 static String mergeAlternately(String word1, String word2) {
	        StringBuilder sb=new StringBuilder();
	        int i=0,j=0;
	        int word1Length=word1.length();
	        int word2Length=word2.length();
	        char[] ch1=word1.toCharArray();
	        char[] ch2=word2.toCharArray();
	        while(i<word1Length || i<word2Length) {
	        	if(i<word1Length) {
	        		sb.append(ch1[i]);	
	        	}
	        	if(i<word2Length) {
	        		sb.append(ch2[i]);
	        	}
	        	i++;
	        }
	        System.out.println(" sb is-- "+ sb);
		 
		 return sb.toString();
	    }
}
