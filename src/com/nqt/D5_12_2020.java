package com.nqt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public static List< List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Map<Integer,List<Integer>> map = new HashMap<Integer, List<Integer>>();
		int n = groupSizes.length;
		for (int i = 0; i < n; i++) {
			List<Integer> list = new ArrayList<Integer>();
			if(map.containsKey(groupSizes[i])) {
				list = map.get(groupSizes[i]);
			}
			list.add(i);
			map.put(groupSizes[i], list);
			if(groupSizes[i] == map.get(groupSizes[i]).size()) {
				result.add(map.get(groupSizes[i]));
				map.remove(groupSizes[i]);
			}
		}
		return result;
	}

}
