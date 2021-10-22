package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams49Test extends BaseTest {
    private GroupAnagrams49 instance = new GroupAnagrams49();

    @Test
    public void test() {
        List<List<String>> expect = new ArrayList<>();
        expect.add(new ArrayList<>() {{
            add("eat");
            add("tea");
            add("ate");
        }});
        expect.add(new ArrayList<>() {{
            add("bat");
        }});
        expect.add(new ArrayList<>() {{
            add("tan");
            add("nat");
        }});
        List<List<String>> actual  = instance.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        for (int i = 0; i < expect.size(); i++) {
            assertListEquals(expect.get(i), actual.get(i));
        }
    }
}
