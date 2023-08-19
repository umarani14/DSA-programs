package com.Strings;

public class PlaceFlowers {
	public static void main(String[] args) {
		int[] flowerbed = { 0,1,0,1,0,1,0,0};
		int n = 1;
		System.out.println(" can place flowers -- " + canPlaceFlowers(flowerbed, n));
//		canPlaceFlowers(flowerbed, n);
	}

	static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int length = flowerbed.length;
		System.out.println("length is-- "+ length);
		for (int i = 0; i <length; i++) {
			if (flowerbed[i] == 0 && (i==0 || flowerbed[i-1]==0) && (i==length-1 || flowerbed[i+1]==0)) {
				flowerbed[i]=1;
				n--;
			}
			if (n == 0) {
				return true;
			}
		}

		return false;
	}
}
