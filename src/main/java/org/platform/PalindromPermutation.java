package org.platform;

import java.util.HashMap;
import java.util.Map;

public class PalindromPermutation {
    public static void main(String[] args) {

//        Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin
//        drome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
//        is a rea rrangement of letters. The palindrome does not need to be limited to just dictionary words.
//        EXAMPLE
//        Input:
//        Output:
//        Tact Coa
//        True (permutations: "taco cat". "atco cta". etc.)

        System.out.println(isPalindrome("Taact Coa"));

    }

    public static boolean isPalindrome(String s) {
        //get rid of spaces and make lowercase
        s = s.replace(" ", "").toLowerCase();
        System.out.println(s);

        //a string can be a palindrome if at most 1 character has an odd count. if more than 1 character has an odd count, it is not a palindrome
        //so, we'll get the count of the characters in a map

        Map<Character, Integer> characterCounts = new HashMap<>();

        for (char c: s.toCharArray()) {
            characterCounts.put(c, characterCounts.getOrDefault(c, 0) + 1);
        }

        //count how many characters are odd
        int oddCount = 0;
        for (int count: characterCounts.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
            //if oddCount exceeds 1, not a palindrome permutation
            if (oddCount > 1) {
                return false;
            }
        }
    return true;
    }




}