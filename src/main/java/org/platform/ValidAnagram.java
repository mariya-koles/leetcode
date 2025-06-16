package org.platform;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

//        Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//         An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; //if the strings have different lengths, they aren't anagrams

        char[] sChars = s.toCharArray(); //conver the strings to character arrays so we can sort alphabetically
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars); //sort the char arrays
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars); //check if the sorted arrays are equal




    }




}