package org.platform;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
//        Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.
//
//        A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element. The elements do not have to be consecutive in the original array.
//
//                You must write an algorithm that runs in O(n) time.
    }


    public int longestConsecutive(int[] nums) {
        //using sorting
        if (nums.length == 0) return 0;  //base case

        Arrays.sort(nums); //sort the array

        //result is final result, current is current number we're looking at, streak is
        //consecutive sequence we have so far, and i is the index
        int result = 0, curr = nums[0], streak = 0, i = 0;

        //while index is less than the total length of the array
        while (i < nums.length) {
            if (curr != nums[i]) { //if our current number isn't the same as the element at the index
                curr = nums[i]; //we set the current number to the element at the index
                streak = 0; //and we reset our streak
            }
            while (i < nums.length && nums[i] == curr) { //while index is less than the length AND
                //the element at the index is the current number we're looking at
                i++; //increment the index, this skips over duplicate numbers like in [0,1,2,2,3]
            }
            streak++; //bump up the streak
            curr++; //increment our current number
            result = Math.max(result, streak); //set result to whatever is bigger, the current result or streak
        }
        return result;
    }

    public int longestConsecutive2(int[] nums) {
        //using Set
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num); //will ignore duplicates
        }
        int longest = 0; //the longest streak we have so far

        for (int num: nums) {
            if (!set.contains(num-1)){ //if the set doesn't contain the current num - 1
                int length = 1; //set the length to 1 as starting
                while (set.contains(num + length)){ //check if there is num+1
                    length++; //if there is, add 1 to length. then we'll check if there is num+2, num+3, etc, to find the longest consecutive sequence
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }




}