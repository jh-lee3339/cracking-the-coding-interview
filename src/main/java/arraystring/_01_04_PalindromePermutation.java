package arraystring;
import java.util.*;
import java.util.Map.Entry;
/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * <p>
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
 */

 // the exmaple output is incorrect? The palindrome does not account for spaces.
class _01_04_PalindromePermutation {
    boolean check(String s) {
        if (s.length() <= 1) {
            return true;
        }
        HashMap<Character, Integer> map = generateMap(s);
        int countOdd = 0;
        for (Integer i : map.values()) {
            if (i % 2 == 1) {
                countOdd++;
            }
        }
        return countOdd <= 1;
    }

    HashMap<Character, Integer> generateMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
