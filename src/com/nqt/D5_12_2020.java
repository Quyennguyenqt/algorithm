package com.nqt;

import java.util.ArrayList;
import java.util.List;

public class D5_12_2020 {

	// https://leetcode.com/problems/number-of-good-pairs/
	public int numIdenticalPairs(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; ++i) {
			for (int j = i + 1; j < nums.length; ++j) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
		}
		return count;
	}

	
	// https://leetcode.com/problems/jewels-and-stones/
	public int numJewelsInStones(String J, String S) {
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			if (J.contains(Character.toString(S.charAt(i)))) {
				count++;
			}
		}
		return count;
	}

	
	// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		int i;
		int n1 = word1.length;
		int n2 = word2.length;

		String st1 = "", st2 = "";
		for (i = 0; i < n1; i++) {
			st1 += word1[i];
		}

		for (i = 0; i < n2; i++) {
			st2 += word2[i];
		}

		if (st1.equals(st2)) {
			return true;
		}
		return false;
	}

	
	// https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> subList[] = new ArrayList[groupSizes.length];
		for (int i = 0; i < groupSizes.length; i++) {
			subList[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < groupSizes.length; i++) {
			int a = groupSizes[i];
			subList[a].add(i);
			if (subList[a].size() == a) {
				list.add(subList[a]);
				subList[a] = new ArrayList<Integer>();
			}
		}
		return list;
	}

}
