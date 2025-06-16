package org.platform;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

//        Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
//        The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
        int[] test = {2,7,4,11,3, 6, 4, 1, 10, 11, 4, 15};
        int val = 4;

        System.out.println(removeElement(test, val));

    }


    public static int removeElement(int[] nums, int val) {
        int k = 0; //counter for number of elements not equal to val

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                //element not val
                nums[k] = nums[j];
                k++;
            }

        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}