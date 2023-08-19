package com.twopointer;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {
	
	public static void main(String[] args) {
		int num=19;
//		System.out.println(" is happy num--- "+ isHappy(num));
//		isHappy1(num);
		System.out.println(" is happy num-- "+ isHappy2(num));
	}
	static boolean isHappy2(int num) {
	    Set<Integer> set = new HashSet<>();
	    
	    while (num != 1 && !set.contains(num)) {
	        set.add(num);
	        int sqRoot = 0;
	        
	        while (num != 0) {
	            int digit = num % 10;
	            sqRoot += digit * digit;
	            num /= 10;
	        }
	        
	        num = sqRoot;
	    }
	    
	    return num == 1;
	}

	static boolean isHappy1(int num) {
		
		Set set=new HashSet<>();
		while(num!=1) {
			int sqRoot=0;
			set.add(num);
			while(num!=0) {
				int r=num%10;
				sqRoot=sqRoot+(r*r);
				num=num/10;
			}	
			if(set.contains(num)) {
				return false;
			}
			num=sqRoot;
			set.add(num);
			
			
		}
		return true;
	}
	
//	giving stack overflow error in leet code
	static boolean isHappy(int num) {
		String s=String.valueOf(num);
		int n=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			int charToIntValue=Character.getNumericValue(ch);
			int sqNum=charToIntValue*charToIntValue;
			 n=n+sqNum;
		}
		if(n!=1) {
		return isHappy(n);
		}
		else{
			return true;
		}
	}
	
//	static int sqRootValue(int num) {
//		String s=String.valueOf(num);
//		int n=0;
//		for(int i=0;i<=s.length()-1;i++) {
////			method to do sq root
//			 n=n+calSqRtValue(s.charAt(i));
//		}
//		return n;
//		
//	}
//	static int calSqRtValue(char s) {
//		int num=Character.getNumericValue(s);
//		int sqNum=num*num;
//		return sqNum;
//	}
	

}
