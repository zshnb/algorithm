package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

public class ReverseString344Test {
    private ReverseString344 reverseString344 = new ReverseString344();

    @Test
    public void test1() {
        char[] array = "hello".toCharArray();
        reverseString344.reverseString(array);
        Assertions.assertArrayEquals(new char[] {'o', 'l', 'l', 'e', 'h'}, array);
    }
}
