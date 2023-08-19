package com.twopointer;

public class MaxVowels {
	
	public static void main(String[] args) {
		String  s = "abciiidef"; int k = 3;
		maxVowels(s, k);
	}
	
	static int maxVowels(String s, int k) {
        int length=s.length();
       int count=0;
        for(int i=0;i<k;i++){
        	 if(isVowel(s.charAt(i)) ) {
        		count ++; 
        	 }
        }
        int max=0;
        for(int i=k;i<length;i++) {
     	   if(isVowel(s.charAt(i))) {
     		   count++;
     	   }if(isVowel(s.charAt(i-k))) {
     		   count--;
     	   }
     	   max=Math.max(max, count);
        }
        return max;
    }
	
	private static boolean isVowel(char c) {
		 if(c=='a'  || c=='e'  || c=='i'  || c=='o'  || c=='u'  ) {
     		return true;
     	 }
		 return false;
	}

}
