package com.nqt;

public class D26_12_2021 {
    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int p = 0; p < nums.length; p++) {
            if (nums[i] != nums[p]) {
                i++;
                nums[i] = nums[p];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
