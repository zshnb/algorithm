package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 思路1：首先检测重复可以通过定义已出现的字符频次数组，然后循环字符串，判断当前字符是否出现过，没有出现过则放入栈中（为了保证顺序），最后题目要求字典序小的结果，
 * 所以在字符入栈时判断一下当前字符与栈顶字典序，把字典序大的出栈，但是当栈顶元素只有1个时，不允许出栈，为了判断当前字符个数，使用另一个数组在最开始记录每个字符的个数
 * 在遍历过程中把对应字符个数减1
 * */
public class RemoveDuplicateLetters316 {
    public String removeDuplicateLetters(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        int[] charCount = new int[128];
        for (char aChar : chars) {
            charCount[aChar] += 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        int[] freq = new int[128];
        while (index < chars.length) {
            char ch = chars[index];
            charCount[ch] -= 1;
            if (freq[ch] != 0) {
                index += 1;
                continue;
            }
            while (!deque.isEmpty() && deque.getFirst() > ch && charCount[deque.getFirst()] > 0) {
                char firstCh = deque.removeFirst();
                freq[firstCh] -= 1;
            }
            deque.addFirst(ch);
            freq[ch] += 1;
            index += 1;
        }

        while (!deque.isEmpty()) {
            stringBuilder.append(deque.removeLast());
        }
        return stringBuilder.toString();
    }
}
