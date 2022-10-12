package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListComponents817Test {
    @Test
    public void successful() {
        LinkedListComponents817 obj = new LinkedListComponents817();
        Assertions.assertEquals(2, obj.numComponents(new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3)))), new int[]{0,1,3}));
        Assertions.assertEquals(1, obj.numComponents(new ListNode(3, new ListNode(4, new ListNode(0, new ListNode(2, new ListNode(1))))), new int[]{4}));
        Assertions.assertEquals(1, obj.numComponents(new ListNode(0, new ListNode(1, new ListNode(2))), new int[]{1,0}));
    }
}
