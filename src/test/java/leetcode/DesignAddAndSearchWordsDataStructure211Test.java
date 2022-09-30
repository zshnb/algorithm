package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DesignAddAndSearchWordsDataStructure211Test {
    @Test
    public void successful() {
        DesignAddAndSearchWordsDataStructure211 obj = new DesignAddAndSearchWordsDataStructure211();
        obj.addWord("bad");
        obj.addWord("dad");
        obj.addWord("mad");
        Assertions.assertFalse(obj.search("pad"));
        Assertions.assertTrue(obj.search("bad"));
        Assertions.assertTrue(obj.search(".ad"));
        Assertions.assertTrue(obj.search("b.."));

        obj = new DesignAddAndSearchWordsDataStructure211();
        obj.addWord("at");
        obj.addWord("and");
        obj.addWord("an");
        obj.addWord("add");
        obj.addWord("bat");
        Assertions.assertFalse(obj.search("b."));
        Assertions.assertFalse(obj.search("."));
    }

    @Test
    public void successful2() {
        DesignAddAndSearchWordsDataStructure211 obj = new DesignAddAndSearchWordsDataStructure211();
        obj.addWord("bad");
        obj.addWord("dad");
        obj.addWord("mad");
        Assertions.assertFalse(obj.search2("pad"));
        Assertions.assertTrue(obj.search2("bad"));
        Assertions.assertTrue(obj.search2(".ad"));
        Assertions.assertTrue(obj.search2("b.."));

        obj = new DesignAddAndSearchWordsDataStructure211();
        obj.addWord("at");
        obj.addWord("and");
        obj.addWord("an");
        obj.addWord("add");
        obj.addWord("bat");
        Assertions.assertFalse(obj.search2("b."));
        Assertions.assertFalse(obj.search2("."));
    }
}
