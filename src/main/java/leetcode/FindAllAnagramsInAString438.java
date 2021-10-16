package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString438 {
    public List<Integer> findAnagrams(String s, String p) {
        int l = 0, r = l + p.length() - 1;

        List<Integer> res = new ArrayList<>();
        char[] array = s.toCharArray();
        for (; l < array.length; l++) {
            if (r < s.length() && check(array, l, r, p)) {
                res.add(l);
            }
            r++;
        }
        return res;
    }

    boolean check(char[] array, int start, int end, String p) {
        int[] freq = new int[128];
        for (int i = 0; i < p.toCharArray().length; i++) {
            freq[p.toCharArray()[i]]++;
        }
        for (int i = start; i <= end; i++) {
            freq[array[i]]--;
            if (freq[array[i]] < 0) {
                return false;
            }
        }
        return true;
    }
}
