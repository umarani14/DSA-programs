package com.twopointer;

public class RemoveVowls {

	public static void main(String[] args) {
		String name="yokshith";
		removeVowels(name);
		
//		System.out.println(removeVowels(name));
//		String op=vowelsReverse(name);
//		System.out.println(op);
	}
	
	private static String vowelsReverse(String name) {
//		hello
		int left=0;
		int right=name.length()-1;
		System.out.println(right);
		char[] ch=name.toCharArray();
		boolean flag=false;
		StringBuilder sb=new StringBuilder();
		while(left<right) {
			if( isVowel(ch[left],flag)) {
				flag=true;
				if(isVowel(ch[right],false) ) {
					char temp=ch[right];
					ch[right]=ch[left];
					ch[left]=temp;
					flag=false;
					left++;
					right--;
				}
				else {
					right--;
				}	
			}else {
				flag=false;
				left++;
			}
			
		}
		sb.append(ch);
		name=sb.toString();
//			System.out.println("after swapping vowels-"+ sb);
			return name;
	}
	
	private static void removeVowels(String name) {
		char[] ch=name.toCharArray();
		int left=0;
		int right=name.length()-1;
		StringBuilder sb=new StringBuilder();
		String n =new String();
		while(left<=right) {
		if(isVowel(ch[left],false)){
			left++;
			}else {
				n=n+ch[left];
				left++;
			}
		}
		System.out.println("after removing vowels-"+n);
	}
	
	
	private static boolean isVowel(char c,boolean flag) {
		if(flag) {
			return true;
		}
		System.out.println("char is-"+ c);
		c=Character.toLowerCase(c);
		
		if( c=='a' || c=='e'|| c=='i' || c=='o' || c=='u') {
			return true;
		}
		return false;
	}
	
}
