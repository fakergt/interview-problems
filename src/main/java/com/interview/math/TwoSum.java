package com.interview.math;

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(result);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
