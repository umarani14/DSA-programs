package com.twopointer;

public class SubString {
	
	    public static void main(String[] args) {
	        String haystack = "sadbutsad";
	        String needle = "but";
	        subStringCheck(haystack, needle);
	        subStringCheck1(haystack, needle);
	        
	        Object.class.hashCode();
	    }
	    
	    private static int subStringCheck(String str1, String str2) {
	    	int index=str1.indexOf(str2);
	    	if(index != -1) {
	    		System.out.println("Position of the substring is "+ index);
	    		return index;
	    	}else {
	    		System.out.println("not a substring "+ index);
	    	return -1;
	    	}
	    }
	    
	    private static int subStringCheck1(String haystack,String needle) {
	    	int haystackLength=haystack.length();
	    	int needleLength=needle.length();
	    	
	    	for(int i=0;i<=haystackLength-needleLength;i++) {
	    		String subString= haystack.substring(i, i+needleLength);
	    		System.out.println(subString + " is");
	    		if(subString.equals(needle)) {
	    			System.out.println(i);
	    			return i;
	    		}
	    	}
	    	return -1;
	    	
	    }
	}
