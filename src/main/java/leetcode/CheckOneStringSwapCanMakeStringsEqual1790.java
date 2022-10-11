package leetcode;

/**
 * 思路1：如果2个字符串存在至少3处下标字符不同，则无法交换2个字符，先遍历2个字符串，记下各自的字符频率，如果频率不同直接返回false,
 * 然后再遍历2个字符串，计算不同下标总数
 * */
public class CheckOneStringSwapCanMakeStringsEqual1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] freq1 = new char[128];
        for (char c : s1.toCharArray()) {
            freq1[c] += 1;
        }
        char[] freq2 = new char[128];
        for (char c : s2.toCharArray()) {
            freq2[c] += 1;
        }

        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] != 0 && freq1[i] != freq2[i]) {
                return false;
            }
        }

        int diffIndexCount = 0;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                diffIndexCount += 1;
            }
            if (diffIndexCount > 2) {
                return false;
            }
        }
        return true;
    }
}
