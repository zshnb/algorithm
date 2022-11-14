package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UncommonWordsTwoSentences884Test {
    @Test
    public void successful() {
        UncommonWordsTwoSentences884 obj = new UncommonWordsTwoSentences884();
        obj.uncommonFromSentences("this apple is sweet", "this apple is sour");
    }
}
