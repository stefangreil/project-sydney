package at.greil.sydney.medium;

public class FirstStringOccuranceFinder {
    public int strStr(String haystack, String needle) {

        char[] chars = haystack.toCharArray();
        char[] charsSub = needle.toCharArray();

        int result = -1;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == charsSub[0]) {
                if ((i + needle.length()) <= chars.length) {
                    String subString = haystack.substring(i, i + needle.length());
                    if (needle.equals(subString)) {
                        result = i;
                        break;
                    }
                }
            }
        }

        return result;
    }
}
