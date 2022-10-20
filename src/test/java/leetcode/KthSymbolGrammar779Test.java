package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthSymbolGrammar779Test {
    @Test
    public void successful() {
        KthSymbolGrammar779 obj = new KthSymbolGrammar779();
        Assertions.assertEquals(0, obj.kthGrammar(3, 4));
        Assertions.assertEquals(0, obj.kthGrammar(3, 1));
        Assertions.assertEquals(1, obj.kthGrammar(2, 2));
        Assertions.assertEquals(0, obj.kthGrammar(2, 1));
        Assertions.assertEquals(1, obj.kthGrammar(3, 3));
    }
}
