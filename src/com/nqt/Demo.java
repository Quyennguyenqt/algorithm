package com.nqt;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(
                new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(
                new Integer[] { 99,100}));
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println(union);
    }
}
