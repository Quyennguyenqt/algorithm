package com.nqt;

public class D13_11_2021 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                count++;
                max = max <= count ? max : count;
            } else {
                count = 0;
            }
        }
        return max;
    }

    public int numIslands(char[][] grid) {
        return 0;
    }

    public void binarySearch(int arr [], int a) {
        int n = arr.length;
        binSear(arr, 0, n-1, a);
    }

    private int binSear(int []arr, int left,int right, int a) {
        int inMid = (left + right)/2;
        if(arr[inMid] > a) {
            binSear(arr, inMid +1, right -1, a);
        } else if(arr[inMid] < a) {
            binSear(arr, 0, inMid -1, a);
        } else{
            return inMid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
                };
        System.out.println(grid[1].length);
    }

}
