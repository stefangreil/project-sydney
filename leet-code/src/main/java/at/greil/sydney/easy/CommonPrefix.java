package at.greil.sydney.easy;

public class CommonPrefix {

    public String longestCommonPrefix(String[] input) {
        if (input.length == 0) {
            return "";
        }

        String longestCommon = input[0];
        if (input.length == 1) {
            return longestCommon;
        }

        for (int i = 1; i < input.length; i++) {
            String actual = getlongestCommonPrefixString(input[i-1], input[i]);

            if(actual.equals("")){
                return actual;
            }

            if(actual.length() < longestCommon.length() && longestCommon.length() > 1){
                longestCommon = actual;
            }
        }

        return longestCommon;
    }

    private static String getlongestCommonPrefixString(String s1, String s2) {
        String longestCommon = "";
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        for (int i = 0; (i < chars1.length) && (i < chars2.length); i++) {
            if (chars1[i] == chars2[i]) {
                longestCommon += chars1[i];
            } else {
                break;
            }
        }
        return longestCommon;
    }
}
