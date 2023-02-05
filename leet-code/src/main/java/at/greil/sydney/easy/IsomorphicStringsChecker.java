package at.greil.sydney.easy;

import java.util.Collection;
import java.util.HashMap;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * <p>
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * <p>
 * https://leetcode.com/problems/isomorphic-strings/
 */
public class IsomorphicStringsChecker {

    public boolean isIsomorphic(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();

        HashMap<Character, Character> hashMap1 = new HashMap<>();
        HashMap<Character, Character> hashMap2 = new HashMap<>();

        for (int i = 0; i < chars1.length; i++) {
            //looking if char is already a key
            if (hashMap1.containsKey(chars1[i])) {
                //when actual chars2 i have to be the same as value
                if (!(chars2[i] == hashMap1.get(chars1[i]))) {
                    return false;
                }
            } else {
                hashMap1.put(chars1[i], chars2[i]);
            }
            hashMap2.put(chars2[i], chars1[i]);
        }

        return hashMap1.size() == hashMap2.size();
    }
}
