package leetcode;

import util.SwapUtil;

/**
 * 思路1：遍历数组前半部分，交换每个与后半部分对应的元素
 * */
public class ReverseString344 {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            SwapUtil.swap(s, i, s.length - i - 1);
        }
    }
}
