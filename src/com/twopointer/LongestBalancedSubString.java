package com.twopointer;

/*
 *Find the longest balanced substring in a given string of letters.
 * A string is balanced if every letter in the string appears in both uppercase and lowercase.
Example 1 :
{
"s": "GOogleLEns"
}
 Output:

"GOogleLE"
 */
public class LongestBalancedSubString {
	public static void main(String[] args) {
	String st="aPPle";
	balString(st);
//	bString(st);
	
	}
	
	/*
	 * o if(st.sub
	 * 
	 * 
	 */
	
	private static void bString(String st) {
		char[] ch=st.toCharArray();
		int left=0;
		int right=st.length()-1;
		int index=0;
		StringBuffer sb=new StringBuffer();

		
		
	}
	
	private static void balString(String st) {
		char[] ch=st.toCharArray();
		int left=0;
		int right=st.length()-1;
		StringBuffer sb=new StringBuffer();
		while(left<right) {
			System.out.println("count");
			if(Character.isUpperCase(ch[left])) {
				System.out.println(ch[left]);
				char c=Character.toLowerCase(ch[left]);
				
				if(c==ch[right]) {
					sb.append(c);
					System.out.println("String buffer is-"+ sb);
					left++;
					right=st.length()-1;
				}
				else {
					right--;
				}
				
			}
			else {
				left++;
			}
//			right--;	
			
			
		}
		
	}
	
}
