package leetcode;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class FindCommonCharacters1002Test extends BaseTest {
    @Test
    public void successful() {
        FindCommonCharacters1002 obj = new FindCommonCharacters1002();
        assertListEquals(new ArrayList<>(){{
            add("e");
            add("l");
            add("l");
        }},obj.commonChars(new String[]{"bella","label","roller"}));

        assertListEquals(new ArrayList<>(){{
            add("c");
            add("o");
        }},obj.commonChars(new String[]{"cool","lock","cook"}));
    }
}
