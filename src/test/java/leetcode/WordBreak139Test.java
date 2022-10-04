package leetcode;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordBreak139Test {
    @Test
    public void successful() {
        WordBreak139 obj = new WordBreak139();
        Assertions.assertTrue(obj.wordBreak("cars", new ArrayList<>(){{
            add("car");
            add("ca");
            add("rs");
        }}));
        Assertions.assertFalse(obj.wordBreak("catsandog", new ArrayList<>(){{
            add("cats");
            add("dog");
            add("sand");
            add("and");
            add("cat");
        }}));
        Assertions.assertTrue(obj.wordBreak("applepenapple", new ArrayList<>(){{
            add("apple");
            add("pen");
        }}));
        Assertions.assertTrue(obj.wordBreak("leetcode", new ArrayList<>(){{
            add("leet");
            add("code");
        }}));
    }
}
