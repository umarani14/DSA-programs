package com.stack;

import java.util.Stack;

public class AsteroidCollision {
	public static void main(String[] args) {
		int a[] = { 10, 2, -5 };
		asteroidCollision1(a);
	}

	static int[] asteroidCollision1(int[] asteroids) {
		int max=0;
		int length=asteroids.length;
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<length;i++) {
			if(asteroids[i]>0) {
				stack.push(asteroids[i]);
			}else {
				while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(asteroids[i])) {
					stack.pop();
				}
				if(stack.peek()==Math.abs(asteroids[i])) {
					stack.pop();
				}else {
					if (stack.isEmpty() || stack.peek() < 0) {
						stack.push(asteroids[i]);
						}
				}
				
				System.out.println(" stack is- "+ stack);
				
			}
		}
		System.out.println(" stack is" + stack);
        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
		
		return res;
	}
	
	static int[] asteroidCollision(int[] asteroids) {
		int max = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < asteroids.length - 1; i++) {
			
			if (asteroids[i] > 0) {
				if (asteroids[i + 1] < 0) {
					int a = Math.abs(asteroids[i + 1]);
					if (a == asteroids[i]) {
						continue;
					} else {
						max = Math.max(a, asteroids[i]);
						if (max == a) {
							stack.push(asteroids[i + 1]);
						} else {
							stack.push(max);
						}
					}
				} else {
					stack.push(asteroids[i]);
				}
			}
		}
		for (int i : stack) {
			System.out.println(" int array is -- " + i);
		}
		System.out.println(" stack is" + stack);
		return null;
	}

}
