package com.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	
	public static void main(String[] args) {
		int[][] intervals = {{5,6},{0,5}};
//			{{1,3},{2,6},{8,10},{15,18}};
		merge1(intervals);
	}
	static int[][] merge1(int[][] intervals){
		List<Integer> list=new ArrayList<>();
		
		Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
//		or 
//		Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
		int column=intervals[0].length;
		for(int i=0;i<intervals.length ;i++) {
        	for(int j=0;j<column;j++) {
        	System.out.println(" "+ intervals[i][j]);
        	}
		}
		int start;
		int end;
		for(int i=0;i<intervals.length-1;i++) {
			for(int j=0;j<column-1;j++) {
			start=intervals[i][j];
			end=intervals[i][j+1];
			
			if(start<intervals[i+1][j] && intervals[i+1][j]<end) {
				list.add(start);
        		list.add(intervals[i+1][j+1]);
			}else {
				list.add(start);
				list.add(end);
			}
			System.out.println(" list is"+ list);
			}
		}
		return intervals;
	}
	static int[][] merge(int[][] intervals) {
		
        int[][] merge=new int[intervals.length-1][intervals[0].length];
        for(int i=0;i<intervals.length-1 ;i++) {
        	int end=intervals[0].length-1;
        	System.out.println(" "+ intervals[i][end]);
        	if(intervals[i][end]>intervals[i+1][end-1] || intervals[i][end]==intervals[i+1][end-1] ) {
        		merge[i][end-1]=intervals[i][end-1];
        		merge[i][end]=intervals[i+1][end];
        	}else {
        		merge[i][end-1]=intervals[i+1][end-1];
        		merge[i][end]=intervals[i+1][end];
        	}
        	System.out.println(" " + merge[i][end-1] + " "+ merge[i][end] );
        }
        return merge;
    }
	

}
