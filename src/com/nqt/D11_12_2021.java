package com.nqt;

public class D11_12_2021 {
    //https://leetcode.com/problems/implement-strstr/
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;
        int j = 0;
        int index = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j < 1) {
                    index = i;
                    if (j < needle.length() - 1) {
                        j++;
                    } else {
                        return index;
                    }
                } else {
                    if (j < needle.length() - 1) {
                        j++;
                    } else {
                        return index;
                    }
                }
            } else {
                if (index != -1) {
                    if (j <= needle.length() - 1) {
                        j = 0;
                    } else {
                        return index;
                    }
                }
            }
        }
        return index;
    }

    public static int strStr1(String haystack, String needle) {
        int lengthOfhaystack = haystack.length();
        int lengthOfneedle = needle.length();
        if (lengthOfneedle == 0) return 0;
        if (lengthOfneedle > lengthOfhaystack) return -1;
        String st = "";
        for (int i = 0; i <= lengthOfhaystack - lengthOfneedle; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                st = haystack.substring(i, i + lengthOfneedle);
                if (st.equals(needle)) {
                    return i;
                } else {
                    continue;
                }
            }
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {

        if (needle.isEmpty()) return 0;
        if (haystack.length() < needle.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.charAt(i) != needle.charAt(0)
                    || haystack.charAt(i + needle.length() - 1) != needle.charAt(needle.length() - 1)) continue;

            int j;
            for (j = 0; j < needle.length(); j++) {

                if (haystack.charAt(i + j) != needle.charAt(j)) break;
            }
            if (j == needle.length()) return i;
        }
        return -1;
    }

    /*tìm length needle
     * duyet cat chuoi of haystack
     * so sanh 2 chuỗi bằng nhau k
     * */
    public static void main(String[] args) {
//        String haystack = "aaa";
//        String needle = "aaaa";
//        String haystack = "hello";
//        String needle = "ll";
        String haystack = "a";
        String needle = "a";
//        String haystack = "mississippi";
//        String needle = "issip";
//        String haystack = "mississippi";
//        String needle= "issipi";
//        String haystack = "mississippi";
//        String needle = "sippia";
        System.out.println(strStr1(haystack, needle));
    }
}
