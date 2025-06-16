package org.platform;

public class OneAway {
    public static void main(String[] args) {
        System.out.println(oneEditAway("pale", "ple"));   // true
        System.out.println(oneEditAway("pales", "pale")); // true
        System.out.println(oneEditAway("pale", "bale"));  // true
        System.out.println(oneEditAway("pale", "bake"));  // false
    }

        public static boolean oneEditAway(String first, String second) {

        //if the difference in length is more than 1, it can't be 1 edit away. adding 2 chars = 2 edits. so false.
            if (Math.abs(first.length() - second.length()) > 1) {
                return false;
            }
            //to simplify handling add/remove, treat one as always shorter
            // if first is shorter than second, it is s1
            //then if first is shorter than second, will always be true, so second is s2
            String s1 = first.length() < second.length() ? first : second;
            String s2 = first.length() < second.length() ? second : first;

            //use indexes to track current characters of s1 and s2
            int index1 = 0, index2 = 0;
            //flag to check whether a difference is found
            boolean foundDifference = false;

            while (index1 < s1.length() && index2 < s2.length()) {
                if (s1.charAt(index1) != s2.charAt(index2)) {
                    if (foundDifference) return false;
                    foundDifference = true;

                    if (s1.length() == s2.length()) {
                        index1++; // on replace, move both pointers
                    }
                    // on insert/delete, move only pointer of longer string
                } else {
                    index1++; // if matching, move shorter pointer
                }
                index2++; // always move pointer for longer string
            }

            return true;
        }

}