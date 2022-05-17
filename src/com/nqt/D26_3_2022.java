package com.nqt;

public class D26_3_2022 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArr = new int[n + 1];
        newArr[0] = 1;
        return newArr;
    }

    public static String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;

        StringBuilder ans=new StringBuilder();

        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0) sum+=(a.charAt(i--) - '0');
            if(j>=0) sum+=(b.charAt(j--) - '0');
            carry=sum>1?1:0;
            ans.append(sum%2);
        }
        if(carry!=0) ans.append(carry);
        return ans.reverse().toString();
    }

    public int numIslands(char [][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count += 1;
                    callBFS(grid, i, j);
                }
            }
        }
        return count;
    }

    private void callBFS(char[][] grid, int i, int j) {

    }
    /*https://leetcode.com/problems/sqrtx/*/
    public static int mySqrt(int x) {
        double l = 0;
        double r = x;
        double m = 1e-6;   // Just take m as what precision you want
        while (r - l > (m)) {
            double mid = (double) (l + r) / 2d;

            if (mid * mid < x) {
                l = mid;
            } else r = mid;
        }
        return (int) r;
    }

    public static void main(String[] args) {
        addBinary("11", "1");
       // System.out.println('1'-'0');
        System.out.println(mySqrt(8));
    }
}
