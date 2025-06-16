package org.platform;

import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
//        Given a string s, return true if it is a palindrome, otherwise return false.
//
//                A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
//
//                Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).
//
//                Example 1:
//
//        Input: s = "Was it a car or a cat I saw?"
//
//        Output: true

        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder newString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                //we only want letters or digits, no spaces or punctuation
                newString.append(Character.toLowerCase(c));
            }
        }
        //newString is now alphanumeric, we can check the reverse using .reverse() of StringBuilder
        return newString.toString().equals(newString.reverse().toString());

    }




}