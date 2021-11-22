package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermutationInString567Test {
    private PermutationInString567 instance = new PermutationInString567();

    @Test
    public void test1() {
        Assertions.assertTrue(instance.checkInclusion("adc", "dcda"));
        Assertions.assertTrue(instance.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    public void test2() {
        Assertions.assertTrue(instance.checkInclusion2("adc", "dcda"));
        Assertions.assertTrue(instance.checkInclusion2("ab", "eidbaooo"));
        Assertions.assertTrue(instance.checkInclusion2("abcdxabcde", "abcdeabcdx"));
        Assertions.assertFalse(instance.checkInclusion2("ab", "eidboaoo"));
        Assertions.assertFalse(instance.checkInclusion2("hello", "ooolleoooleh"));
    }
}
