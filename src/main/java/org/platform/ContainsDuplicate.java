package org.platform;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        //given an integer array nums, return true if any value appears more than once in the array, otherwise return false

        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
        System.out.println(containsDuplicate(new int[]{-5, 3, -9, 3, 1, 2, 5, 7, 8, 94293}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 2, 9, 10, 11, 12}));

    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); //map to store the numbers
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                //we have seen this number before, so it is a duplicate
                return true;
            } else {
                map.put(nums[i], i); // we haven't seen this number before, add it to the map as (number, index)
            }
        }
        return false;
    }




}