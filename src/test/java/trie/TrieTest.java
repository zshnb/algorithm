package trie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tree.Trie;

public class TrieTest {
    @Test
    public void successful() {
        Trie trie = new Trie();
        trie.addWord("and");
        trie.addWord("accept");
        trie.addWord("word");
        trie.addWord("world");

        Assertions.assertTrue(trie.exist("word"));
        Assertions.assertFalse(trie.exist("worth"));
    }
}
