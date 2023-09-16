package com.nqt;

public class D31_07_2022 {
    public String longestPalindrome(String s) {
        int length = s.length();
        String st = "babad";
        String str = "cbbd";
        String longestPalindrome = s.substring(0,2);
        for (int i = 0;;) {

        }
    }
    /*https://leetcode.com/problems/plus-one/*/
    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        int [] arrDigits = new int[length + 1];
        for (int i = length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10)
                return digits;
            else
                digits[i] = 0;

            arrDigits[i + 1] = digits[i];
        }
        if (digits[0] == 0) {
            arrDigits[0] = 1;
            return arrDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
//        String s = "babad";
//        System.out.println(s.substring(0,2));
        int [] digits = {9,9,9};
        for(int a: plusOne(digits)) {
            System.out.println(a);
        }
    }
}
