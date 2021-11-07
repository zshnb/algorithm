package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal144Test extends BaseTest {
    private BinaryTreePreorderTraversal144 instance = new BinaryTreePreorderTraversal144();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> expect = new ArrayList<>()
        {{
            add(1);
            add(2);
            add(3);
        }};
        assertListEquals(expect, instance.preorderTraversal(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> expect = new ArrayList<>()
        {{
            add(1);
            add(2);
            add(3);
        }};
        assertListEquals(expect, instance.preorderTraversal2(root));
    }
}
