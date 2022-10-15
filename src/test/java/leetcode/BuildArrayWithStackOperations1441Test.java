package leetcode;

import java.util.List;
import org.junit.jupiter.api.Test;

public class BuildArrayWithStackOperations1441Test {
    @Test
    public void successful() {
        BuildArrayWithStackOperations1441 obj = new BuildArrayWithStackOperations1441();
        List<String> result = obj.buildArray(new int[]{1,3}, 3);
        printList(result);
        result = obj.buildArray(new int[]{1,2,3}, 3);
        printList(result);
        result = obj.buildArray(new int[]{1,2}, 4);
        printList(result);
    }

    void printList(List<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println();
    }
}
