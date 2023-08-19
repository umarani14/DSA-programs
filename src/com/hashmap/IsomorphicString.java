package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
	
	public static void main(String[] args) {
		String  s = "baba", t = "abba";
		isIsomorphic(s, t);
	}
	static boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map=new HashMap<>();
		Map<Character,Boolean> map1=new HashMap<>();
//		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
		
				if(map.containsKey(s.charAt(i))){
					Character ch=map.get(t.charAt(i));
					if(ch!=null && ch.equals(t.charAt(i))) {
						continue;
					}else {
						return false;
					}
				}else {
					if(map.containsValue(t.charAt(i))) {
						Character ch=map.get(t.charAt(i));
						if(ch!=null && ch.equals(s.charAt(i))) {
							continue;
						}
						return false;
					}
					map.put(s.charAt(i), t.charAt(i));
				}
			
		}
//		if(map1.containsValue(false)) {
//			System.out.println(" is not isomorphic-- ");
//			return false;
//		}
//		if(count==s.length()) {
//			System.out.println(" is isomorphic --");
//			return true;
//		}
		
		System.out.println(" is  isomorphic");
		return true;
	}

}
