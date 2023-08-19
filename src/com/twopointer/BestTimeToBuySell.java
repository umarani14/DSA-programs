package com.twopointer;

public class BestTimeToBuySell {
	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
//		System.out.println("max profit is ---"+ maxProfit(prices));
//		MaxProfitOptimized(prices);
		MaxProfit2(prices);
	}
	
	static int MaxProfitOptimized(int[] prices) {
		int sell=0,buy=Integer.MAX_VALUE;
		
		for(int i=0;i<prices.length;i++) {
			buy=Math.min(buy,prices[i]);
			sell=Math.max(sell, prices[i]-buy);			
		}
		System.out.println("selling value is-"+ sell);
		return sell;
	}
	
	static int MaxProfit2(int[] prices) {
		int sell=0,buy=Integer.MAX_VALUE,profit=0;
		for(int i=0;i<prices.length;i++) {
			buy=Math.min(buy, prices[i]);
			sell=Math.max(sell, prices[i]-buy);
			profit=profit+sell;
		}
		System.out.println("max profit is---"+ profit);
		return profit;
	}
	  static int maxProfit(int[] prices) {
		  int min=Integer.MAX_VALUE;
		  int max=0;
		  int position = 0;
		  int maxProfit=0;
		  for(int i=0;i<prices.length;i++) {
			  min=Math.min(min, prices[i]);
		  }
		  for(int i=0;i<prices.length;i++) {
			  if(min==prices[i]) {
				  position=i;
				  break;
			  }
			 
		  }
		  for(int i=position+1;i<prices.length;i++) {
			  int currMax=Math.max(max, prices[i]);
			  max=currMax;
			  
		  }
		  if(position==prices.length-1) {
			  return 0;
		  }else {
			  return max-min;
		  }
//		  maxProfit=max-min;
//		  return 0;
	    }

}
