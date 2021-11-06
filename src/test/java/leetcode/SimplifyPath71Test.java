package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimplifyPath71Test {
    private SimplifyPath71 instance = new SimplifyPath71();

    @Test
    public void test() {
        Assertions.assertEquals("/home", instance.simplifyPath("/home/"));
        Assertions.assertEquals("/home/foo", instance.simplifyPath("/home//foo"));
        Assertions.assertEquals("/", instance.simplifyPath("/../"));
        Assertions.assertEquals("/c", instance.simplifyPath("/a/./b/../../c/"));

    }
}
