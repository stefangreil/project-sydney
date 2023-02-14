package at.greil.sydney.medium;

import java.util.Arrays;

public class Zigzag {
    public String convert(String s, int numRows) {

        if (s.length() == 1 || numRows == 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        int length = chars.length;

        int interval = (numRows - 2) + 1;
        int rowCounter = 0;
        int intervalCounter = 0;
        int intervalSpaceCounter = interval - 1;
        char[][] matrix = new char[length][numRows];
        for (int i = 0; i < length; i++) {
            intervalCounter++;
            if (i == 0 || intervalCounter == interval) {
                int max = (i + numRows) <= (length - 1) ? i + numRows : length;
                matrix[rowCounter] = s.substring(i, max).toCharArray();
                intervalCounter = 0;
                i = max - 1;
            } else {
                matrix[rowCounter][intervalSpaceCounter] = chars[i];
                intervalSpaceCounter--;
                if (intervalSpaceCounter == 0) {
                    intervalSpaceCounter = interval - 1;
                }
            }
            rowCounter++;
        }

        String res = "";

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < rowCounter; j++) {
                if (res.length() == s.length()) {
                    break;
                }
                if (matrix[j].length > i && '\u0000' != matrix[j][i]) {
                    res += String.valueOf(matrix[j][i]);
                }
            }
        }

        return res;
    }
}
