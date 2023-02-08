package at.greil.sydney.easy;

public class SubsequenceChecker {

    public boolean isSubsequence(String s, String t) {

        char[] chars = s.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            if (t.contains("" + chars[i])) {
                char[] tempT = t.toCharArray();
                for (int j = 0; j < tempT.length; j++) {
                    if (chars[i] == tempT[j]) {
                        t = t.substring(j+1);
                        s = s.substring(1);
                        if (t.length() < s.length()) {
                            return false;
                        }
                        break;
                    }
                }
            } else {
                return false;
            }
        }

        return s.length() == 0;
    }
}
