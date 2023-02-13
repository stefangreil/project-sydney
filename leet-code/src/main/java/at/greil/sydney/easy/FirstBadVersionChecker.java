package at.greil.sydney.easy;

import lombok.Data;
import lombok.Getter;

@Data
public class FirstBadVersionChecker {

    int version;

    public int firstBadVersion2(int n) {

        for (int i = n; i > 0; i--) {
            if (isBadVersion(i)) {
                return i;
            }
        }

        return -1;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2; //getting the mid
            if (isBadVersion(mid)) { // setting the new mid
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    public boolean isBadVersion(int version) {
        return (version >= this.version);
    }
}
