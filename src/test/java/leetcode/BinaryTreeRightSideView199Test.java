package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView199Test extends BaseTest {
    private BinaryTreeRightSideView199 instance = new BinaryTreeRightSideView199();

    @Test
    public void test1() {
        List<Integer> list = new ArrayList<>()
        {{
            add(1);add(3);add(4);
        }};
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
        assertListEquals(list, instance.rightSideView(root));
    }

    @Test
    public void test2() {
        List<Integer> list = new ArrayList<>()
        {{
            add(1);add(3);add(4);
        }};
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
        assertListEquals(list, instance.rightSideView2(root));
    }
}
