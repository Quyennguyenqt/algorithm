package com.nqt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class D5_12_2020 {

	// https://leetcode.com/problems/number-of-good-pairs/
	public static int numIdenticalPairs(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int num : nums) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else if (map.containsKey(num)) {
				count += map.get(num);
				map.put(num, map.get(num) + 1);
			}
		}
		return count;
	}

	
	// https://leetcode.com/problems/jewels-and-stones/
	public int numJewelsInStones(String J, String S) {
		 int count = 0;
	      for (int i = 0; i < S.length(); i++) {
	        if (J.indexOf(S.charAt(i)) != -1) {
	            count++;
	        }
	      }
	      return count;
	}

	
	// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String st1 = appendString(word1);
		String st2 = appendString(word2);
		return st1.equals(st2);
	}

	public String appendString(String[] word) {
		StringBuilder sb = new StringBuilder();
		for (String st : word) {
			sb.append(st);
		}
		return sb.toString();
	}

	
	// https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		int n = groupSizes.length;
		for (int i = 0; i < n; i++) {
			List<Integer> list = new ArrayList<Integer>();
			if (map.containsKey(groupSizes[i])) {
				list = map.get(groupSizes[i]);
			}
			list.add(i);
			map.put(groupSizes[i], list);
			if (groupSizes[i] == map.get(groupSizes[i]).size()) {
				result.add(map.get(groupSizes[i]));
				map.remove(groupSizes[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
	}
}
