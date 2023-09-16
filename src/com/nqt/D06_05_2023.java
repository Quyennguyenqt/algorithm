package com.nqt;

import java.util.*;

/*https://leetcode.com/problems/3sum/*/
public class D06_05_2023 {
    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<Integer> listNumber = new ArrayList<>();
        for (int num : nums) {
            listNumber.add(num);
        }
        Collections.sort(listNumber);
        Set<List<Integer>> distinctThreeSum = new HashSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (listNumber.get(i) + listNumber.get(j) + listNumber.get(k) == 0) {
                        List<Integer> sumOfThreeNumber = new ArrayList<>();
                        sumOfThreeNumber.add(listNumber.get(i));
                        sumOfThreeNumber.add(listNumber.get(j));
                        sumOfThreeNumber.add(listNumber.get(k));
                        distinctThreeSum.add(sumOfThreeNumber);
                    }
                }
            }
        }
        return new ArrayList<>(distinctThreeSum);
    }

    public static List<List<Integer>> threeSum1(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> distinctThreeSum = new HashSet<>();
        for (int i = 0; i < length; i++) {
            int j = i + 1;
            int k = length -1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> sumOfThreeNumber = new ArrayList<>();
                    sumOfThreeNumber.add(nums[i]);
                    sumOfThreeNumber.add(nums[j]);
                    sumOfThreeNumber.add(nums[k]);
                    distinctThreeSum.add(sumOfThreeNumber);
                }
                j++;
                k--;
            }
        }
        return new ArrayList<>(distinctThreeSum);
    }

    public double average(int[] salary) {
        int sum = 0;
        Arrays.sort(salary);
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        return (double) sum / (salary.length - 2);
    }

    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
