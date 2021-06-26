package com.nqt;

import java.util.HashMap;

public class D26_6_2021 {

    //https://leetcode.com/problems/palindrome-number/
    public boolean isPalindrome(int x) {
        int temp = x;
        int palindrome = 0;
        if (x < 0) return false;
        while (x != 0) {
            int a = x % 10;
            x /= 10;
            if (palindrome > Integer.MAX_VALUE || palindrome == Integer.MAX_VALUE && a > 7) return false;
            if (palindrome < Integer.MIN_VALUE || palindrome == Integer.MIN_VALUE && a < -8) return false;
            palindrome = palindrome * 10 + a;
        }
        return palindrome == temp ? true : false;
    }

    //https://leetcode.com/problems/roman-to-integer/
    public static int romanToInt(String s) {
        int total = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            if(i+1 < s.length()) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') { total += 4;i += 1;continue; }
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') { total += 9;i += 1;continue; }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') { total += 40;i += 1;continue; }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') { total += 90;i += 1;continue; }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') { total += 400;i += 1;continue; }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') { total += 900;i += 1;continue; }
            }
            if (hm.containsKey(s.charAt(i))) total += hm.get(s.charAt(i));
        }
        return total;
    }
}

