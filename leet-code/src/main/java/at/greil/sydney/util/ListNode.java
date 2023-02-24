package at.greil.sydney.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) { this.val = val; }
}
