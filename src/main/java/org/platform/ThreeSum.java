package org.platform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {
    public static void main(String[] args) {
    //Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0, and the indices i, j and k are all distinct.
    //
    //The output should not contain any duplicate triplets. You may return the output and the triplets in any order.

//        Input: nums = [-1,0,1,2,-1,-4]
//
//        Output: [[-1,-1,2],[-1,0,1]]
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        //using a hashmap for lower time/space complexity

        //sort the arrays
        Arrays.sort(nums);

        Map<Integer, Integer> count = new HashMap<>();
        for (int num: nums) {
            count.put(num, count.getOrDefault(num, 0) + 1); //will add all elements to map
            //for [2,4,5]
            //map will look like {2: 1, 4: 1, 5: 1} because we set the default to 0 then add 1
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) { //iterate over the array, looping through each nums[i] as the first number in the triplet
            count.put(nums[i], count.get(nums[i]) - 1); // put the element at num[i], and subtract 1 temporarily, since we are using it now
            if (i > 0 && nums[i] == nums[i - 1]) continue; //if it's a duplicate of a previous number, skip to avoid duplicate triplets

            for (int j = i + 1; j < nums.length; j++) { //loop through each element as the second number nums[j]
                count.put(nums[j], count.get(nums[j]) - 1); //temporarily reduce the count of nums[j]
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; //skip duplicates for the second number as well

                int target = -(nums[i] + nums[j]); //find the third number that would make the sum zero
                if (count.getOrDefault(target, 0) > 0) {
                    res.add(Arrays.asList(nums[i], nums[j], target)); //if target exists in the count map and hasn't been used up, add nums i and j and target
                }
            }

            for (int j = i + 1; j < nums.length; j++) { //After finishing all j iterations for a given i, restore the counts of nums[j] that we temporarily reduced.
                count.put(nums[j], count.get(nums[j]) + 1);
            }
        }
        return res;

    }




}