package at.greil.sydney.medium;

import java.util.LinkedList;

public class ReverseListAdditionner {

    /**
     * 2. Add Two Numbers
     *
     * Example 1:
     *
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     */
    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        var i1 = getValue(l1);
        var i2 = getValue(l2);
        var result = i1 + i2 + "";
        StringBuilder reversedResult = new StringBuilder();

        for (char element : result.toCharArray()) {
            reversedResult.insert(0, element);
        }

        var l3 = new LinkedList<Integer>();
        for (char element : reversedResult.toString().toCharArray()) {
            l3.add(Integer.parseInt(String.valueOf(element)));
        }

        return l3;
    }

    private int getValue(LinkedList<Integer> l1) {
        StringBuilder value = new StringBuilder();
        for (int element : l1) {
            value.insert(0, element);
        }
        return Integer.parseInt(value.toString());
    }
}
