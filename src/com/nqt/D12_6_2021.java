package com.nqt;


public class D12_6_2021 {
    //https://leetcode.com/problems/reverse-integer/
    public static int reverse(int x) {
        long t1 = System.currentTimeMillis();
        int reverseDigits = 0;
        while (x != 0) {
            //check if reverseDigits will overflow
            if (reverseDigits > Integer.MAX_VALUE / 10 || reverseDigits < Integer.MIN_VALUE / 10)
                return 0;
            //Update reverseDigits
            reverseDigits = (10 * reverseDigits) + (x % 10);
            x /= 10;
        }
        System.out.println(System.currentTimeMillis() - t1);
        return reverseDigits;
    }

    //https://leetcode.com/problems/palindrome-number/
    public boolean isPalindrome(int x) {
        
        return false;
    }
}
