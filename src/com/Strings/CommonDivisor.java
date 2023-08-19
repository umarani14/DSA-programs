package com.Strings;

import java.util.HashSet;
import java.util.Set;

/*
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
 */
public class CommonDivisor {
	
	public static void main(String[] args) {
		String str1 = "ABCABCABC", str2 = "ABCABC";
		System.out.println("gcdOfStrings(str1, str2); "+ gcdOfStrings(str1, str2));
	}
	static String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            // Swap str1 and str2 if str1 is shorter
            return gcdOfStrings(str2, str1);
        } else if (!str1.startsWith(str2)) {
            // If str2 is not a prefix of str1, no common divisor exists
            return "";
        } else if (str2.isEmpty()) {
            // If str2 is empty, str1 is the GCD
            return str1;
        } else {
            // Recursively find GCD by reducing str1 and str2
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }
	
	
//	 static String gcdOfStrings(String str1, String str2) {
//	       int str2Length=str2.length();
//	       char[] ch1=str1.toCharArray();
//	       char[] ch2=str2.toCharArray();
//	       int i=0;
//	       HashSet<Character> set=new HashSet<>();
//	       while(i<str2Length) {
//	    	 if(ch1[i]==ch2[i]) {
//	    			 set.add(ch2[i]); 
//	    	 }
//	    	 i++;
//	       }
//	       
////		 String result=String.join("", set);
//	       String result = set.toString().replaceAll("\\,|\\[|\\]|\\s", "");
//		 
//		 System.out.println(" result is -- "+ result);
//		 return set.toString();
//		 }
}
