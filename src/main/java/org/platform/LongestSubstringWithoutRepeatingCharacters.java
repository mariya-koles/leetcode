package org.platform;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
//        Given a string s, find the length of the longest substring without duplicate characters.
//
//                A substring is a contiguous sequence of characters within a string.
//
//        Example 1:
//
//        Input: s = "zxyzxyz"
//
//        Output: 3
    }

    public int lengthOfLongestSubstring(String s) {
        //we will use the sliding window approach with a left pointer
        int l = 0; //left pointer
        int result = 0; //length of longest substring

        HashSet<Character> charSet = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                //in the r we are checking, we have found a duplicate, so we know it must be at l
                charSet.remove(s.charAt(l)); //we remove the character at l
                l++; //we move the left pointer up when we encounter a duplicated character
                //we do this as many times as the charSet contains a duplicate
            }
            charSet.add(s.charAt(r));
            result = Math.max(result, r-l+1);
        }

        return result;
    }




}