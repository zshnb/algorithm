package leetcode;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordBreakII140Test {
    @Test
    public void successful() {
        WordBreakII140 obj = new WordBreakII140();
        List<String> strings = obj.wordBreak("catsanddog", new ArrayList<>(){{
            add("cat");
            add("cats");
            add("and");
            add("sand");
            add("dog");
        }});
        printList(strings);
    }

    void printList(List<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
