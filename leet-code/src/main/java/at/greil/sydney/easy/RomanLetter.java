package at.greil.sydney.easy;

public class RomanLetter {

    /**
     * 13. Roman to Integer
     * Example 3:
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     *
     * @param s given String which should be converted from Romansymbols into decimal values
     * @return
     */
    public int romanToInt(String s) {
        int romanValue = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char actual = chars[i];
            for (RomanNumber romanNumber : RomanNumber.values()) {
                if (actual == romanNumber.symbol) {
                    romanValue += romanNumber.value;
                    if (romanNumber.isSubtractable && ((i + 1) < chars.length)) {
                        for (RomanNumber substractionRomanNumber : RomanNumber.values()) {
                            if (chars[i + 1] == substractionRomanNumber.symbol && actual == substractionRomanNumber.substractionSymbol) {
                                romanValue += substractionRomanNumber.value - (romanNumber.value * 2);
                                i++;
                                break;
                            }
                        }
                    }
                }
            }

        }
        return romanValue;
    }

    public enum RomanNumber {
        I('I', 1, true, 'A'),
        V('V', 5, false, 'I'),
        X('X', 10, true, 'I'),
        L('L', 50, false, 'X'),
        C('C', 100, true, 'X'),
        D('D', 500, false, 'C'),
        M('M', 1000, false, 'C');

        public final char symbol;
        public final int value;
        public final boolean isSubtractable;
        public final char substractionSymbol;

        private RomanNumber(char symbol, int value, boolean isSubtractable, char substractionSymbol) {
            this.symbol = symbol;
            this.value = value;
            this.isSubtractable = isSubtractable;
            this.substractionSymbol = substractionSymbol;
        }
    }
}


