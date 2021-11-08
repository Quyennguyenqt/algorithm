package com.nqt;

import java.util.ArrayList;
import java.util.List;

public class D18_9_2021 {
    //https://leetcode.com/problems/first-unique-character-in-a-string/
    public static int firstUniqChar(String s) {
        List ls = new ArrayList();
        int length = s.length();
        if(length == 1) return 0;
        for (int i = 0; i < length; i++) {
            if(ls.contains(s.charAt(i))) {
               continue;
            } else {
                ls.add(s.charAt(i));
                if(i == length -1) return i;
                for (int j = i + 1; j < length; j++) {
                    if(s.charAt(i) == s.charAt(j)) {
                        break;
                    } else if(j == length -1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static int firstUniqChar1(String s) {
        char [] ch = s.toCharArray();
        int [] count = new int[123];

        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            int index = (int)c;
            count[index]++;
        }
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            int index = (int) c;
            if(count[index] == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s =  "dddccdbba";
        System.out.println(firstUniqChar(s));
    }
}
