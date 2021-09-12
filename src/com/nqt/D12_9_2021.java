package com.nqt;

public class D12_9_2021 {
    //https://leetcode.com/problems/remove-element/
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if(nums[i] == val) {
                for (int k = i+1; k < length; k++) {
                    nums[k-1] = nums[k];
                }
                length--;
            }
            if(nums[i] == val) i--;
        }
        return length;
    }
    public static int removeElement1(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        int val = 2;
        removeElement1(nums,val);
    }
}
