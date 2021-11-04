package leetcode;

/**
 * 思路1：先找到链表中点，将链表拆成2半，然后反转后一半，然后将2个链表1边取1个的方式连接起来
 * */
public class ReorderList143 {
    public void reorderList(ListNode head) {
        ListNode l1 = head;
        ListNode middle = findMiddleNode(head);
        ListNode l2 = middle.next;
        middle.next = null;
        l2 = reverse(l2);
        merge(l1, l2);
    }

    ListNode findMiddleNode(ListNode head) {
        ListNode p = head, q = head;
        while (q.next != null && q.next.next != null) {
            p = p.next;
            q = q.next.next;
        }
        return p;
    }

    ListNode reverse(ListNode head) {
        ListNode reverseHead = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = reverseHead;
            reverseHead = curr;
            curr = next;
        }
        return reverseHead;
    }

    void merge(ListNode l1, ListNode l2) {
        ListNode temp1, temp2;
        while (l1 != null && l2 != null) {
            temp1 = l1.next;
            temp2 = l2.next;
            l1.next = l2;
            l1 = temp1;

            l2.next = l1;
            l2 = temp2;
        }
    }
}
