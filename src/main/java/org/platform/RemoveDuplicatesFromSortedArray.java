package org.platform;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int[] test = {2,7,11,11,15};
        System.out.println(removeDuplicatesReturnUnique(test));
    }


    public static int removeDuplicatesReturnUnique(int[] nums) {
        //since the array is sorted, we know the elements will be next to each other
        int i = 0; //the last unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; //moves the next unique element forward.
            }
        }
        return i + 1;
    }
}