package at.greil.sydney.easy;


/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Example 1:
 *
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 */
public class LastWordLengthChecker {

    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int endIndex = chars.length;
        int beginnIndex = 0;

        if (endIndex == 0) {
            return 0;
        }

        if (endIndex == 1) {
            return chars[0] != ' ' ? 1 : 0;
        }

        for (int i = endIndex-1; i > 0; i--) {
            if (chars[i] != ' ') {
                endIndex = i;
                break;
            }
        }

        for (int i = endIndex-1; i > 0; i--) {
            if (chars[i] == ' ') {
                beginnIndex = i;
                break;
            }
        }

        if (beginnIndex == 0) {
            beginnIndex = (chars[0] != ' ') ? -1 : 0;
        }

        return endIndex - beginnIndex;
    }
}

