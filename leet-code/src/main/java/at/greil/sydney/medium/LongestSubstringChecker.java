package at.greil.sydney.medium;

import java.util.HashMap;

/**
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * Example 1:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSubstringChecker {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> resultHashMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.size() > resultHashMap.size()) {
                resultHashMap = new HashMap<>(hashMap);
            }
            if (hashMap.containsKey(chars[i])) {
                i = hashMap.get(chars[i]) + 1;
                hashMap.clear();
            }
            hashMap.put(chars[i], i);
            if (i == chars.length - 1 && hashMap.size() > resultHashMap.size()) {
                resultHashMap = new HashMap<>(hashMap);
            }
        }

        if (resultHashMap.size() == 0) {
            return s.length();
        }

        return resultHashMap.size();
    }
}
