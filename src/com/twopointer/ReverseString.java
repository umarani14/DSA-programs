package com.twopointer;

public class ReverseString {
	
	public static void main(String[] args) {
		String name="yokshIth";
//		revString(name);
		vowelsReverse(name);
		System.out.println(vowelsReverse(name));
	}
	private static String vowelsReverse(String name) {
		int left=0;
		int right=name.length()-1;
		System.out.println(right);
		char[] ch=name.toCharArray();
		
		StringBuilder sb=new StringBuilder();
		while(left<right) {
			if(isVowel(ch[left]) ) {
				if(isVowel(ch[right]) ) {
					char temp=ch[right];
					ch[right]=ch[left];
					ch[left]=temp;	
					left++;
					right--;
				}else {
					right--;
				}	
			}else {
				left++;
			}
			
		}
		sb.append(ch);
		name=sb.toString();
//			System.out.println("after swapping vowels-"+ sb);
			return name;
	}
	
	private static boolean isVowel(char c) {
		c=Character.toLowerCase(c);
		if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u') {
			return true;
		}
		return false;
		
	}
	
	private static void revString(String name) {
		String[] newName=name.split(" ");
//		char[] charName=name.toCharArray();
		for(int i=0;i<=newName.length-1;i++) {
//			System.out.println(newName[i]);
			int left=0;
			int right=newName[i].length()-1;
			char[] ch=newName[i].toCharArray();
			StringBuilder n=new StringBuilder();
			while(right>left) {
//				System.out.println(newName[i]);
				
				char temp=ch[right];
				ch[right]=ch[left];
				ch[left]=temp;
				right--;
				left++;
				
			}
			n.append(ch);
			n.append(" ");
			System.out.println(n);
//			System.out.println(newName[i]);
		}
		
//		int left=0;
//		int right=newName.length-1;
//		while(right>left) {
//			String temp=newName[right];
//			newName[right]=newName[left];
//			newName[left]=temp;
//			right--;
//			left++;
//			
//		}
//		for(int i=0;i<=newName.length-1;i++) {
//			System.out.println(newName[i]);
//		}
		
		
//		for(int i=charName.length-1;i>=0;i--) {
//			System.out.println(charName[i]);
//		}
	}

}
