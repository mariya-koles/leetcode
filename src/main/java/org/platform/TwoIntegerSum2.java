package org.platform;

import java.util.HashMap;
import java.util.Map;

public class TwoIntegerSum2 {
    public static void main(String[] args) {

//        Given an array of integers numbers that is sorted in non-decreasing order.
//
//                Return the indices (1-indexed) of two numbers, [index1, index2], such that they add up to a given target number target and index1 < index2. Note that index1 and index2 cannot be equal, therefore you may not use the same element twice.
//
//        There will always be exactly one valid solution.
//
//        Your solution must use O(1) additional space.

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int other = target - current;
            if (map.containsKey(other)) {
                return new int[]{map.get(other), i +1}; //we add 1 here because the array is 1-indexed
            }
            map.put(nums[i], i+1); //same here, we add 1 here because the array is 1-indexed


        }
        return new int[0];
    }


    public int[] twoSum2(int[] nums, int target) {
        //using pointers to get O(1) space complexity
        int l = 0, r = nums.length - 1; //set the left and right pointers as the first and last indexes

        while (l < r) {
            int curSum = nums[l] + nums[r]; //current sum is the sum of the two pointers

            if (curSum > target) {
                //if the sum is greater than the target, we reduce our right pointer
                r--;
            } else if (curSum < target) {
                //if the sum is less than the target, we increase our left pointer
                l++;
            } else {
                //if curSum == target
                return new int[]{l+1, r+1};  //we add 1 to our pointers/indexes, because the array is 1-indexed
            }
        }
        return new int[0];
    }




}