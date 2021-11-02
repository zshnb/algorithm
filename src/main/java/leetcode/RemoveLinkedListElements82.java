package leetcode;

import java.util.Map;
import java.util.TreeMap;

/**
 * 思路1：遍历一次链表，将链表中的数字以及出现频率存入map，然后遍历map，构建出新链表<br>
 * 思路2：设置虚拟头节点指向原头节点，从虚拟头节点开始，如果下个节点的值与下下个节点的值相等，记录节点的值，循环将相同值的节点全部删掉，否则往后移动指针
 * */
public class RemoveLinkedListElements82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        Map<Integer, Integer> map = new TreeMap<>();
        ListNode p = head;
        while (p != null) {
            map.put(p.val, map.getOrDefault(p.val, 0) + 1);
            p = p.next;
        }
        ListNode result = new ListNode(-1);
        p = result;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == 1) {
                p.next = new ListNode(integerIntegerEntry.getKey());
                p = p.next;
            }
        }
        return result.next;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null) return null;
        ListNode virtualHead = new ListNode(-1, head);
        ListNode p = virtualHead;
        while (p.next != null && p.next.next != null) {
            if (p.next.val == p.next.next.val) {
                int x = p.next.val;
                while (p.next != null && p.next.val == x) {
                    p.next = p.next.next;
                }
            } else {
                p = p.next;
            }
        }
        return virtualHead.next;
    }
}
