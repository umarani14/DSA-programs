package com.Strings;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
	
	public static void main(String[] args) {
	int[] candies = {2,3,5,1,3};
	int extraCandies = 3;
	kidsWithCandies(candies, extraCandies);
		
	}
	  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		  List<Boolean> list=new ArrayList<>();
		  int max=0;
		  for(int c:candies) {
			  max=Math.max(max, c);
			  
		  }
		  for(int c:candies) {
			  if(c+extraCandies>=max) {
				  list.add(true);
			  }else {
				  list.add(false);
			  }
		  }
		  System.out.println("list is-- "+ list);
		  
		  return list;
		  
	    }

}
