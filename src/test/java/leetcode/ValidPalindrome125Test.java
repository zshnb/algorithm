package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindrome125Test {
    private ValidPalindrome125 validPalindrome125 = new ValidPalindrome125();

    @Test
    public void test1() {
        boolean result = validPalindrome125.isPalindrome1("A man, a plan, a canal: Panama");
        Assertions.assertTrue(result);

        result = validPalindrome125.isPalindrome1("race a car");
        Assertions.assertFalse(result);

        result = validPalindrome125.isPalindrome1(".");
        Assertions.assertTrue(result);
    }
}
