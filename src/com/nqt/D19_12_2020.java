package com.nqt;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class D19_12_2020 {
	// https://leetcode.com/problems/remove-outermost-parentheses/
	public static String removeOuterParentheses(String S) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		int op = 0;
		int cl = 0;
		for (char c : S.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else {
				int num = stack.size();
				if (c == ')' && num != 1) {
					for (int i = 0; i < num - 1; i++) {
						char ch = stack.pop();
						sb.append(ch);
						++op;
					}
					sb.append(c);
					++cl;
				} else {
					if (op == cl) {
						stack.pop();
					} else {
						sb.append(c);
						++cl;
					}
				}
			}
		}
		return sb.toString();
	}

	// https://leetcode.com/problems/build-an-array-with-stack-operations/
	public List<String> buildArray(int[] target, int n) {
//		List<String> list = new ArrayList<String>();
//		Stack<Integer> stack = new Stack<Integer>();
//		int a = target[target.length - 1];
//		int x = target.length - 1;
//		for (int i = x; i >= 0; i--) {
//			stack.push(target[i]);
//		}
//		for (int i = 1; i <= a; i++) {
//			int b = stack.peek();
//			if (i == b) {
//				list.add("Push");
//				stack.pop();
//			} else {
//				list.add("Push");
//				list.add("Pop");
//			}
//		}
//		return list;

		List<String> list = new ArrayList<String>();
		int j = 1;
		for (int i = 0; i < target.length; i++) {
			if (target[i] == j) {
				list.add("Push");
				++j;
			} else {
				list.add("Push");
				list.add("Pop");
				++j;
				--i;
			}
		}
		return list;
	}

	// https://leetcode.com/problems/baseball-game/
	public static int calPoints(String[] ops) {
		int sum = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (String s : ops) {
			switch (s) {
			case "+":
				stack.push(stack.peek() + stack.get(stack.size() - 2));
				break;
			case "D":
				stack.push(stack.peek() * 2);
				break;
			case "C":
				stack.pop();
				break;
			default:
				stack.push(Integer.parseInt(s));
				break;
			}
		}
		for (Integer num : stack) {
			sum += num;
		}
		return sum;
	}

	// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
	public int minAddToMakeValid(String S) {
//		int count = S.length();
//		Stack<Character> stack = new Stack<Character>();
//		for (char c : S.toCharArray()) {
//			if (stack.empty()) {
//				if (c == ')') {
//					continue;
//				}
//				stack.push(c);
//			} else {
//				char ch = stack.peek();
//				if (c == ch) {
//					stack.push(c);
//				} else if (c == ')') {
//					stack.pop();
//					count -= 2;
//				}
//			}
//		}
//		return count;
		
		int n = S.length();
		int op = 0;
		int cl = 0;
		for (int i = 0; i < n; i++) {
			if (S.charAt(i) == '(') {
				++op;
			} else {
				if (op == 0) {
					++cl;
				} else {
					--op;
				}
			}
		}
		return op + cl;
	}
}
