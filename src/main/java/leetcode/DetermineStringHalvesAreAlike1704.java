package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 思路1：2路同时计数，左边计数加，右边计数减，返回结果是否等于0
 * */
public class DetermineStringHalvesAreAlike1704 {
    public boolean halvesAreAlike(String s) {
        int i = 0, j = s.length() / 2;
        Set<Character> set = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int count = 0;
        while (j < s.length()) {
            char leftCh = s.charAt(i);
            char rightCh = s.charAt(j);
            if (set.contains(leftCh)) {
                count += 1;
            }
            if (set.contains(rightCh)) {
                count -= 1;
            }
            i += 1;
            j += 1;
        }
        return count == 0;
    }
}
