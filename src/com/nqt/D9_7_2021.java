package com.nqt;

public class D9_7_2021 {
    //https://leetcode.com/problems/longest-common-prefix/

//    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) return "";
//        String prefix = strs[0];
//        for (int i = 1; i < strs.length; i++)
//            while (strs[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length() - 1);
//                if (prefix.isEmpty()) return "";
//            }
//        return prefix;
//    }
    /*
     * Giả sử chuỗi thứ 1 của mảng là chuỗi chung dài nhất
     * Dùng vòng for duyệt xét vị trí t2 trở đi
     * Dùng hàm indexOf tìm vị trí của của chuỗi chung
     * Nếu vị trí là 0 --> xét chuỗi tiếp theo của mảng
     * Nếu vị trí là khác 0 --> thay thế chuỗi chung dài nhất là chuỗi con trừ đi ký tự cuối
     * Nếu chuỗi chung dài nhất là rỗng thì trả về kết quả rỗng.
     *
     * */

//    public static String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) return "";
//        for (int i = 0; i < strs[0].length() ; i++){
//            char c = strs[0].charAt(i);
//            for (int j = 1; j < strs.length; j ++) {
//                if (i == strs[j].length() || strs[j].charAt(i) != c)
//                    return strs[0].substring(0, i);
//            }
//        }
//        return strs[0];
    public static String longestCommonPrefix(String[] strs) {
        int index = 0;
        StringBuffer prefix = null;
        char c = strs[0].charAt(index);
        for(int i = 1; i < strs.length; i++) {
            for(int j = 0; j< strs[i].length();j++) {
                if(c == strs[i].charAt(index) && i == strs.length -1){
                    prefix.append(c);
                }
                if(c != strs[i].charAt(index)){
                    return prefix.toString();
                }
                break;
            }
            index = strs[0].length() == index? -1: index+1;
            if(index == -1) return prefix.toString();
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String strs [] = {"flower","flow","flight"};
       longestCommonPrefix(strs);
       String s = "abc";
       int a = s.indexOf("b");
        System.out.println(a);
    }
}
