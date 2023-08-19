package com.twopointer;

public class IsSubsequence {
	public static void main(String[] args) {

		String  s = "abc", t = "ahbgdc";
		System.out.println(" is Subsequence-- "+ isSubsequence(s, t));
//		isSubsequence(s, t);
	}

	static boolean isSubsequence(String s, String t) {
		int sIndex=0,tIndex=0;
		int tLength=t.length();
		int sLength=s.length();
		while(sIndex<sLength && tIndex<tLength) {
			if(s.charAt(sIndex)==t.charAt(tIndex)) {
				sIndex++;
			}
			tIndex++;
		}
		return sIndex==sLength;
	}

}
