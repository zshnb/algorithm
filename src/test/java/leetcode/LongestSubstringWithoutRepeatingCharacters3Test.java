package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharacters3Test {
    private LongestSubstringWithoutRepeatingCharacters3 instance = new LongestSubstringWithoutRepeatingCharacters3();

    @Test
    public void test1() {
        Assertions.assertEquals(2, instance.lengthOfLongestSubstring1("aab"));
        Assertions.assertEquals(3, instance.lengthOfLongestSubstring1("aabaab!bb"));
        Assertions.assertEquals(2, instance.lengthOfLongestSubstring1("au"));
        Assertions.assertEquals(3, instance.lengthOfLongestSubstring1("abcabcbb"));
        Assertions.assertEquals(3, instance.lengthOfLongestSubstring1("pwwkew"));
        Assertions.assertEquals(1, instance.lengthOfLongestSubstring1("bbbbb"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(3, instance.lengthOfLongestSubstring2("abcb"));
        Assertions.assertEquals(2, instance.lengthOfLongestSubstring2("aab"));
        Assertions.assertEquals(3, instance.lengthOfLongestSubstring2("aabaab!bb"));
        Assertions.assertEquals(2, instance.lengthOfLongestSubstring2("au"));
        Assertions.assertEquals(3, instance.lengthOfLongestSubstring2("abcabcbb"));
        Assertions.assertEquals(3, instance.lengthOfLongestSubstring2("pwwkew"));
        Assertions.assertEquals(1, instance.lengthOfLongestSubstring2("bbbbb"));
    }
}
