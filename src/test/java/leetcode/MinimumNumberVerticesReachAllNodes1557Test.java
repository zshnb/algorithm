package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MinimumNumberVerticesReachAllNodes1557Test {
    @Test
    public void successful() {
        MinimumNumberVerticesReachAllNodes1557 obj = new MinimumNumberVerticesReachAllNodes1557();
        List<Integer> result = obj.findSmallestSetOfVertices(6, new ArrayList<>(){{
            add(Arrays.asList(0, 1));
            add(Arrays.asList(0, 2));
            add(Arrays.asList(2, 5));
            add(Arrays.asList(3, 4));
            add(Arrays.asList(4, 2));
        }});
        printList(result);
    }

    void printList(List<Integer> list) {
        list.forEach(System.out::print);
        System.out.println();
    }
}
