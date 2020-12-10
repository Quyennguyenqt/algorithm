package com.nqt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class D12_12_2020 {

	// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
	public int numberOfSteps(int num) {
		int count = 0;
		while (num != 0) {
			if (num % 2 == 0) {
				num /= 2;
				++count;
			} else {
				--num;
				++count;
			}

		}
		return count;
	}

	// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
	public static int[] smallerNumbersThanCurrent(int[] nums) {
//			int a[] = new int[nums.length];
//			int count = 0;
//			for (int i = 0; i < nums.length; i++) {
//				for (int j = 0; j < nums.length; j++) {
//					if (nums[i] > nums[j]) {
//						++count;
//					}
//				}
//				a[i] = count;
//				count = 0;
//			}
//			return a;

		int temp[] = nums.clone();
		Arrays.sort(nums);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], i);
			}
		}
		for (int i = 0; i < temp.length; i++) {
			nums[i] = map.get(temp[i]);
		}
		return nums;

	}
	
	// https://leetcode.com/problems/richest-customer-wealth/
		public static void maximumWealth(int[][] accounts) {
			int temp = 0;
			int max = 0;
			for (int i = 0; i < accounts.length; i++) {
				for (int j = 0; j < accounts[i].length; j++) {
					temp += accounts[i][j];
				}
				if (temp > max) {
					max = temp;
					temp = 0;
				}
				System.out.println();
			}
			System.out.println(max);
		}
	
	// https://leetcode.com/problems/valid-parentheses/
		public static boolean isValid(String s) {
			Stack<Character> stack = new Stack<Character>();
			for (char c : s.toCharArray()) {
				if (c == '(' || c == '{' || c == '[') {
					stack.push(c);
				} else {
					
					char ch = stack.pop();
					
					boolean b1 = c == ')'
							&& ch != '(';
					boolean b2 = c == '}'
							&& ch != '{';
					boolean b3 = c == ']'
							&& ch != '[';
					
					if(b1 || b2 || b3) {
						return false;
					}
				}
			}

			return stack.empty();
		}
}
