package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 思路1：使用map存放节点与对应出现次数，在遍历链表时把对应节点次数+1，如果出现环形链表，则某个节点出现次数会大于1
 * 思路2：使用快慢指针（快指针每次移动2格），当快指针与慢指针相遇，说明有环
 * */
public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> nodeWithCount = new HashMap<>();
        while (head != null) {
            nodeWithCount.put(head, nodeWithCount.getOrDefault(head, 0) + 1);
            if (nodeWithCount.get(head) > 1) {
                return true;
            }
            head = head.next;
        }

        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast != null && slow == fast) {
                return true;
            }
        }
        return false;
    }
}
