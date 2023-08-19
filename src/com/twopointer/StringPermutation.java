package com.twopointer;

public class StringPermutation {

	public static void main(String[] args) {
		String s1="asb",s2="bcdasb";
//		permutationString(s1, s2);
		System.out.println(permutationString(s1, s2));
	}
	
	private static boolean permutationString(String s1,String s2) {
		int left=0;
		int lenght=s1.length();
		while(left<s2.length()) {
			if(!s2.substring(left, left+lenght).equals(s1)) {
				left=left+1;
				System.out.println("not permuted");
				
			}else {
			System.out.println("is permutation");
			return true;
			}
		}
		return false;
		
	
	}
}
