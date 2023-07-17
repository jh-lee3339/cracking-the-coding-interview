package arraystring;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */

class _01_01_IsUnique {

    /* 
    Attempt 1: Brute Force Solution
    Time: O(N^2)
    Space: O(1)
    boolean isUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    */

    /*
     * Attempt 2: HashSet
     * Time: O(N)
     * Space: O(N)
     */
    boolean isUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!set.add(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }


}
