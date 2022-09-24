package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 思路1：根据题目意思，公有的字符集是全部字符串字符的交集，因此只需要先求出前2个字符串的临时交集，然后后续字符串都与临时交集继续取交集，最后交集
 * 就是全部字符串字符的公共字符
 * */
public class FindCommonCharacters1002 {
    public List<String> commonChars(String[] words) {
        if (words.length < 2) {
            return Arrays.asList(words);
        }
        int[] commonFreq = getCommonFreq(words[0], words[1]);
        for (int i = 2; i < words.length; i++) {
            int[] freq = getFreq(words[i]);
            for (int j = 0; j < commonFreq.length; j++) {
                if (commonFreq[j] <= freq[j]) {
                    continue;
                }
                if (commonFreq[j] > freq[j]) {
                    commonFreq[j] = freq[j];
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < commonFreq.length; i++) {
            while (commonFreq[i] != 0) {
                result.add(((char)i) + "");
                commonFreq[i] -= 1;
            }
        }
        return result;
    }

    private int[] getCommonFreq(String s1, String s2) {
        int[] freq1 = getFreq(s1);
        int[] freq2 = getFreq(s2);

        int[] commonFreq = new int[128];
        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] != 0 && freq2[i] != 0) {
                commonFreq[i] = Math.min(freq1[i], freq2[i]);
            }
        }
        return commonFreq;
    }

    private int[] getFreq(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c] += 1;
        }
        return freq;
    }
}
