package org.platform;

public class ContainerWithMostWater {
    public static void main(String[] args) {
//        You are given an integer array heights where heights[i] represents the height of the
//                ith bar.
//
//                You may choose any two bars to form a container. Return the maximum amount of water a container can store.
    }


    public int maxAreaBruteForce(int[] height) {
        int result = 0; //result is the area

        for (int i = 0; i < height.length; i++){
            for (int j = i+1; j< height.length; j++) {
                result = Math.max(result, Math.min(height[i], height[j]) * (j - i));
                //we pick the bigger of the two, the current result we have, or:
                //the smaller of the two heights (you can't store more water than the shorter wall), multiplied by the width, which is index j - 1
            }
        }
        return result;
    }

    public int maxArea(int[] height) {
        //two pointer solution
        int result = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, area);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }


}