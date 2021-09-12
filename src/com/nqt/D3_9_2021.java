package com.nqt;

public class D3_9_2021 {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums) {
            if(quantity(num) %2 == 0)
                count++;
        }
        return count;
    }

    private static int quantity(int num) {
        int count = 0;
        while (num != 0) {
            num/=10;
            count++;
        }
        return count;
    }

    //https://leetcode.com/problems/merge-sorted-array/
    /*ex1*/
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m+n;
        if(size == m) return;
        int j = 0;
        for (int i = m; i< size; i++) {
            nums1[i] = nums2[j];
            if(j < n) j++;
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int k = i+1; k < nums1.length; k++){
                if(nums1[i] > nums1[k]){
                    int temp = nums1[i];
                    nums1[i] = nums1[k];
                    nums1[k] = temp;
                }
            }
        }
        for (int a: nums1) {
            System.out.println(a);
        }
    }
    /*ex2*/
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        for(int num: nums2) {
            insertArray(nums1,m,num);
            m++;
        }
    }

    private static void insertArray(int[] nums1,int m, int num) {
        boolean bl = false;
        for(int i = 0; i < m; i++) {
            if(nums1[i] > num) {
                bl = true;
                for(int k = m-1; k >=i; k--) {
                    nums1[k+1] = nums1[k];
                }
                nums1[i] = num;
                break;
            }
        }
        if(bl == false) nums1[m] = num;
    }


    public static void main(String[] args) {
//        int nums1 []= {0};
//        int nums2 []= {1};
//        int m = 0, n = 1;
        int nums1 []= {4,5,6,0,0,0};
        int nums2 []= {1,2,3};
        int m = 3, n = 3;
        merge1(nums1,m,nums2,n);
    }
}
