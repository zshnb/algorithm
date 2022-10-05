package leetcode;

import java.util.List;
import org.junit.jupiter.api.Test;

public class SubdomainVisitCount811Test {
    @Test
    public void successful() {
        SubdomainVisitCount811 obj = new SubdomainVisitCount811();
        List<String> result = obj.subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
        printList(result);
    }

    void printList(List<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
