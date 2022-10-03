package leetcode;

/**
 * 思路1：使用滑动窗口遍历出所有连续1构成的子字符串，个数大于2返回false
 * 思路2：判断字符串是否由左边连续的1和右边连续的0组成，因此只需要左（扫描1字符）右（扫描0字符）两个指针向中间移动，直到两个指针遇到非法字符时
 * 停下，最后判断两个指针是否为相邻
 * */
public class CheckBinaryStringHasSegmentOfOnes1784 {
    public boolean checkOnesSegment(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = 0;
        int interruptCount = 0;
        boolean hasChanged = false;
        while (j < chars.length && i < chars.length) {
            j = i;
            while (j < chars.length && chars[i] == '1' && chars[j] == '1') {
                j += 1;
                hasChanged = true;
            }
            if (hasChanged) {
                interruptCount += 1;
                hasChanged = false;
                i = j;
            } else {
                i += 1;
            }
        }
        return interruptCount <= 1;
    }
}
