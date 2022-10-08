package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionTwoLinkedLists160Test {
    @Test
    public void successful() {
        IntersectionTwoLinkedLists160 obj = new IntersectionTwoLinkedLists160();
        ListNode common = new ListNode(3, new ListNode(4, new ListNode(5)));
        ListNode a = new ListNode(1, new ListNode(2, common));
        ListNode b = new ListNode(11, new ListNode(22, new ListNode(33, common)));
        ListNode result = obj.getIntersectionNode(a, b);
        Assertions.assertEquals(3, result.val);
    }
}
