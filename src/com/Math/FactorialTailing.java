package com.Math;

public class FactorialTailing {

	public static void main(String[] args) {
		int n=13;
		trailingZeroes(n);
	}
	
	static int trailingZeroes(int n) {
        int product=1;
        while(n>0){
            product=product*n;
            n--;
        }
        System.out.println(" prodict  is - "+ product);
       int[] a= Integer.toString(product).chars().map(c-> c-'0').toArray();
       
       int count=0;

       for(int i=0;i<a.length;i++){
    	   System.out.println(" array is "+ a[i]);
           if(a[i]==0){
               count++;
           }
       }
       System.out.println(" count is - "+ count);
         return count;
    }
  
}
