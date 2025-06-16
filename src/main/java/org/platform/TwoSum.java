package org.platform;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] test = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(test, target)));

        System.out.println(Arrays.toString(twoSumBetter(test, target)));
    }

    //slow
    //time: O(n^2), where n is the number of elements
    //space: O(1)
    //often times with such time and space complexity, this can be improved to have time: O(n) and space: O(n)
    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }
        return solution;
    }

    public static int[] twoSumBetter(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int other = target - current;
            if (map.containsKey(other)) {
                //we found the other value
                return new int[] {map.get(other), i};
            } else {
                map.put(current, i);
            }
        }
        return null;
    }




}