package org.platform;

import java.util.HashMap;
import java.util.HashSet;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
//        You are given a string s consisting of only uppercase english characters and an integer k. You can choose up to k characters of the string and replace them with any other uppercase English character.
//
//                After performing at most k replacements, return the length of the longest substring which contains only one distinct character.
    }

    public int characterReplacement(String s, int k) {
        //using sliding window
        int result = 0;

        HashMap<Character, Integer> count = new HashMap<>(); //to store the count of the characters
        int l = 0, maxf = 0; //left pointer, maximum frequency

        for (int r = 0; r < s.length(); r++) {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            //put each character on the map, with default of 0, or whatever get is, + 1
            maxf = Math.max(maxf, count.get(s.charAt(r))); //set the max frequency to whatever is higher, maxf or the value of the count of the char

            //While the number of characters we’d need to replace to make the whole window one repeating character is more than k, shrink the window from the left
            while ((r - l + 1) - maxf > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            result = Math.max(result, r-l+1);
        }

        return result;

    }




}