package leetcode;

/**
 * 思路1：字符串排序后比较是否相等
 * 思路2：把2个字符串转换为ascii字符计数数组后，比较2个计数数组是否相等
 * 思路3：使用1个计数数组，遍历时第一个字符串字符计数+1，第二个字符串字符计数-1，最后看当前下标字符计数是否为0
 * */
public class CheckPermutationLcci1_2 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] freq1 = getFreq(s1);
        int[] freq2 = getFreq(s2);
        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] getFreq(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c] += 1;
        }
        return freq;
    }
}
