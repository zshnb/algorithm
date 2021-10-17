package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagram242Test {
    private ValidAnagram242 instance = new ValidAnagram242();

    @Test
    public void test() {
        Assertions.assertTrue(instance.isAnagram("anagram", "nagaram"));
    }
}
