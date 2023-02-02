package at.greil.sydney.easy;

public class PalindromeNumber {

    /**
     * 9. Palindrome Number
     *
     * Example 1:
     * <p>
     * Input: x = 121
     * Output: true
     * Explanation: 121 reads as 121 from left to right and from right to left.
     *
     * @param x given integer to check if it´s a palindrome
     * @return if the given integer is a palindrome
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String input = Integer.toString(x);
        String first;
        String second;
        int inputLength = input.length();
        boolean isEven = ((inputLength % 2) == 0);

        if (isEven) {
            first = input.substring(0, inputLength / 2);
            second = input.substring(inputLength / 2, inputLength);
        } else {
            first = input.substring(0, (inputLength - 1) / 2);
            second = input.substring((inputLength + 1) / 2, inputLength);
        }

        String reversedSecond = "";
        char ch;
        if (second.length() > 1) {
            for (int i = second.length()-1; i >= 0; i--) {
                ch = second.charAt(i);
                reversedSecond += ch;
            }
            return first.equals(reversedSecond);
        }
        return first.equals(second);
    }
}
