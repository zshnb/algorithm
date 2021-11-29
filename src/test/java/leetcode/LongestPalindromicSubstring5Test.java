package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstring5Test {
    private LongestPalindromicSubstring5 instance = new LongestPalindromicSubstring5();

    @Test
    public void test1() {
        Assertions.assertEquals("bab", instance.longestPalindrome("babad"));
    }
}
