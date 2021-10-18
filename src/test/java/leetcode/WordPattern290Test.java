package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordPattern290Test {
    private WordPattern290 instance = new WordPattern290();

    @Test
    public void test1() {
        Assertions.assertTrue(instance.wordPattern("abba", "dog cat cat dog"));
        Assertions.assertFalse(instance.wordPattern("abba", "dog cat cat fish"));
    }
}
