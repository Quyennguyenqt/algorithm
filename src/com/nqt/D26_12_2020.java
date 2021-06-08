package com.nqt;

import java.util.ArrayList;
import java.util.List;

public class D26_12_2020 {
	
	
	class ListNode {
		int val;
		ListNode next;

		ListNode() {}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
	
	class Solution {
		public int getDecimalValue(ListNode head) {
			ListNode curr = head;
			ArrayList<Integer> list = new ArrayList<>();
			while (curr.next != null) {
				list.add(curr.val);
				curr = curr.next;
			}
			list.add(curr.val);
			return valueDecimal(list);
		}

		public int valueDecimal(List<Integer> list) {
			int result = 0;
			int n = list.size();
			for (int i = 0; i < n; i++) {
				result += list.get(i) * Math.pow(2, n - i - 1);
			}
			return result;
		}
	}
	
	// https://leetcode.com/problems/middle-of-the-linked-list/
	 public ListNode middleNode(ListNode head) {
	       List<ListNode> list = new ArrayList<ListNode>();
			ListNode curr = head;
			while (curr != null) {
				list.add(curr);
				curr = curr.next;
			}
			int n = list.size();
			for (int i = 0; i < n / 2; i++) {
				list.remove(0);
			}
	        return list.get(0);
	    }
	
	
}
