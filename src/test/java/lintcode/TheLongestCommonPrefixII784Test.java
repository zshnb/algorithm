package lintcode;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TheLongestCommonPrefixII784Test {
    @Test
    public void successful() {
        TheLongestCommonPrefixII784 obj = new TheLongestCommonPrefixII784();
        Assertions.assertEquals(2, obj.theLongestCommonPrefix(new ArrayList<>(){{
            add("abcba");
            add("acc");
            add("abwsf");
        }}, "abse"));
        Assertions.assertEquals(3, obj.theLongestCommonPrefix(new ArrayList<>(){{
            add("aaa");
            add("bbb");
            add("aabb");
        }}, "aaab"));
    }
}
