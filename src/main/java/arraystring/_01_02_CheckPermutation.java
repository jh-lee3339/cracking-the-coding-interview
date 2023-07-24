package arraystring;

import java.util.*;

/**
 * Given two strings,write a method to decide if one is a permutation of the other.
 */



class _01_02_CheckPermutation {
    /*
    * HashMap approach
    * Space: O(N)
    * Time: O(N)
    */
      /*
    boolean check(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> amap = new HashMap<>();
        HashMap<Character, Integer> bmap = new HashMap<>();
        for (Character c: a.toCharArray()) {
            amap.put(c, amap.getOrDefault(c, 1));
        }
        for (Character c: b.toCharArray()) {
            bmap.put(c, bmap.getOrDefault(c, 1));
        }
        return amap.equals(bmap);
    }
    */

    /*
     * Mapping using arrays
     * Space: O(1)
     * Time: O(N)
     */
    boolean check(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int[] amap = new int[26];
        int[] bmap = new int[26];
        for (Character c: a.toCharArray()) {
            amap[c - 'a']++;
        }
        for (Character c: b.toCharArray()) {
            bmap[c - 'a']++;
        }
        return Arrays.equals(amap, bmap);
    }
}

    
    
