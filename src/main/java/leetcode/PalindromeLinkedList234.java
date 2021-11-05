package leetcode;

/**
 * 思路1：将链表转成数组，判断数组回文<br>
 * 思路2：从链表中点处开始，将后一半链表反转，之后从2条链表头节点开始对比，有任何不同处就不是回文
 * */
public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        int[] array = new int[10000];
        int index = 0;
        ListNode p = head;
        while (p != null) {
            array[index] = p.val;
            index = index + 1;
            p = p.next;
        }
        if (index == 1) return true;
        for (int i = 0;i < index;i++) {
            if (array[i] != array[index - i - 1]) {
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome2(ListNode head) {
        ListNode l1 = head;
        ListNode middle = findMiddleNode(head);
        ListNode l2 = middle.next;
        middle.next = null;
        l2 = reverse(l2);
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
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
}
