package at.greil.sydney.easy;

import java.util.*;

public class DuplicatesRemover {

    public int removeDuplicates(int[] nums) {

        Set<Integer> numSet = new HashSet<>(nums.length);
        for (int i : nums) {
            numSet.add(i);
        }
        ArrayList numList = new ArrayList<>(numSet);
        Collections.sort(numList);
        for (int i = 0; i < nums.length; i++) {
            if (numList.size() > i) {
                nums[i] = (int) numList.get(i);
            } else {
                nums[i] = 0;
            }
        }

        return numSet.size();
    }

}
