package com.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
	
	public static void main(String[] args) {
		String s = "anagrmd", t = "nagaram";
//		isAnagram(s, t);
		
		isAnagramUsingString(s, t);
	}
//	using hashmap
	static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<=s.length()-1;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else {
            map.put(s.charAt(i),1);
            }
        }
        int count=0;
       for(int i=0;i<=t.length()-1;i++){
           if(map.containsKey(t.charAt(i))){
               Character ch=t.charAt(i);
//               int a=map.get(t.charAt(i));
                if(!ch.equals(null) && map.get(t.charAt(i))>=1){
                	count++;
                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
                }
           }
           
       }
       if(count==t.length()){
    	   System.out.println("is anagram-- ");
           return true;
       }
       System.out.println(" in not anagram");
        return false;
	}
	
//	using strings concept
	
	static boolean isAnagramUsingString(String s,String t) {
		char[] ch=s.toCharArray();
		char[] ch1=t.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if(s.length()!=t.length()){
			return false;
		}
		for(int i=0;i<=s.length()-1;i++) {
			if(ch[i]!=ch1[i]) {
				return false;
			}
		}
		return true;
	}

}
