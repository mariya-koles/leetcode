package org.platform;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllUniqueCharacters {
    public static void main(String[] args) {
        isUniqueChars("cat");

    }

    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false; // more characters than ASCII

        boolean[] charSet = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) return false;
            charSet[val] = true;
        }

        return true;
    }



}