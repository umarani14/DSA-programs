package com.twopointer;

public class ShiftArraySearch {
	public static void main(String[] args) {
		int[] nums= {9,12,17,2,4,5};
		int num=2;
		shiftedArrSearch(nums, num);
	}
	
	  static int shiftedArrSearch(int[] shiftArr, int num) {
		    // your code goes here
		    //for(int i=0;i<shiftArr.length;i++){
		      //if(shiftArr[i]==num){
		       // return i;
		      //}
		    int left=0,right=shiftArr.length-1;
		    while(left<=right){
		      int mid=(left+right)/2; //(right-left)/2+left;
		      if(shiftArr[mid] == num){
		        return mid;
		      }
		      if(shiftArr[left]<=shiftArr[mid]) {
		    	  if(num>=shiftArr[left] && num<shiftArr[mid]){
			        right=mid-1;
			      }
			      else{
			        left=mid+1;
			      }
		      }else {
		    	   if(num<shiftArr[right] && num> shiftArr[mid]){
				        left=mid+1;
				      }
				      else{
				    	  System.out.println("left is "+ left);
				        right=mid-1;
				      }
		      }
		   
		      }
		    
		  
		  return -1;
	  }
	  }
