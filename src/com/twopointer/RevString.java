package com.twopointer;

import java.util.ArrayList;

public class RevString {
	
	public static void main(String[] args) {
		String sentance="Myself umarani";
//		flesym inaramu
		String[] stringArray=sentance.split(" ");
		String name="uma rani";
		char [] chName=name.toCharArray();
		char[] s = {'h','e','l','l','o'};
//		reverseString(chName);
//		reverseString(s);
		revSentence(stringArray);
		reverseWords(sentance);
	}
    public static  void reverseString(char[] s) {
        int left=0,right=s.length-1;
        char temp;
        while(left<=right){
            temp=s[right];
            s[right]=s[left];
            s[left]=temp;
            left++;
            right--;
        }
        System.out.println(s);
    }
    public static String revSentence(String[] stringArray) {
    	StringBuilder s=new StringBuilder();
//    	String s = null;
    	for(int i=0;i<=stringArray.length-1;i++) {
		char[] ch=stringArray[i].toCharArray();
		int left=0,right=ch.length-1;
		char temp;
		while(left<=right) {
			temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
			
		}
		s.append(ch);
		s.append(" ");
    	}
    	System.out.println(s.toString().trim());
    	return s.toString().trim();
    }
    
    public static String reverseWords(String s) {
    	ArrayList list=new ArrayList<>();
    	list.add(s);
        String[] stringArray=s.split(" ");
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<=stringArray.length-1;i++) {
            char[] ch=stringArray[i].toCharArray();
            int left=0,right=ch.length-1;
            char temp;
            while(left<=right) {
                temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;            
            }
            s1.append(ch);
            s1.append(" ");
        }
        System.out.println(s1);
        return s1.toString().trim();
    }

}
