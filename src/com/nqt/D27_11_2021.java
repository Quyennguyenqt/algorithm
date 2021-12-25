package com.nqt;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/product-of-array-except-self/
public class D27_11_2021 {
    public static int[] productExceptSelf(int[] nums) {
        int j =0, i = 0, s = 1,  n = nums.length, temp=0;
        int result[] = new int[n];
        while(j < n) {
            if(i == j) {
                temp = nums[i];
                nums[i] = 1;
            }
            s *= nums[i];
            if(i == n - 1) {
                result[j] = s;
                nums[j] = temp;
                s = 1;
                i = - 1;
                j++;
            }
            i++;
        }
        return result;
    }

    public static int[] productExceptSelf1(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;

        for(int i =1 ;i < nums.length;i++){
            result[i] = result[i-1] * nums[i-1];
        }

        for( int i = nums.length-2 ; i>=0 ;i --){
            result[i] = result[i] * nums[i+1];
            // update current nums to be nums[i] * nums[i+1] - such that nums[i] on
            //the next loop has the mul factor to multiply with the result
            nums[i] = nums[i] * nums[i+1];
        }

        return result;
    }



    public static void main(String[] args) {
        int []nums ={1,2,3,4};
        int []nums1 = {-1,1,0,-3,3};
        productExceptSelf1(nums);
        for (int a : productExceptSelf1(nums)) {
            System.out.print(a + "  ");
        }
    }
}
