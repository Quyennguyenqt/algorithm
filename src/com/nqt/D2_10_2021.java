package com.nqt;

import javax.xml.transform.sax.SAXSource;

public class D2_10_2021 {
    /*https://leetcode.com/problems/binary-search*/
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid]  > target){
                right-=1;
            } else {
                left+=1;
            }
        }
        return -1;
    }

    public static int bSearch(int[] nums, int target) {
        int n = nums.length;
        return binarySearch(nums, target, 0, n -1);
    }

    private static int binarySearch(int[] nums, int target, int left, int right) {
        int mid = (left + right)/2;
        if(left > right) {
            return -1;
        }
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarySearch(nums, target, 0, mid -1);
        } else {
            return binarySearch(nums, target, mid+1, right);
        }
    }
    /*https://leetcode.com/problems/longest-substring-without-repeating-characters/*/
    public static int lengthOfLongestSubstring(String s) {
        String substring = "";
        int max = 1;
        if (s.isEmpty()) return 0;
        for(int i = 0; i < s.length(); i++) {
            if(substring.isEmpty()) {
               substring += s.charAt(i);
            } else {
                Character c = s.charAt(i);
                if(substring.contains(c.toString())){
                    if(max < substring.length()) {
                        max = substring.length();
                    }
                    int a = substring.indexOf(c);
                    substring = substring.substring(a+1,substring.length());
                    i--;
                } else {
                    substring +=s.charAt(i);
                    if(i == s.length() -1) {
                        return max > substring.length() ? max : substring.length();
                    }
                }
            }
        }
        return max > substring.length() ? max : substring.length();
    }


    public static void main(String[] args) {
//        int[] a = {1,4,9,12,19,25,31,46,50,57,72};
//        System.out.println(bSearch(a,31));
        //String s = "dvdf";
        //String s = "abcabcbb";
        //String s = "bbbbb";
        String s = "";
        System.out.println(s.isEmpty());
        //System.out.println(lengthOfLongestSubstring(s));
    }
}
