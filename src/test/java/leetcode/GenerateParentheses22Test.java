package leetcode;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenerateParentheses22Test extends BaseTest {
	private GenerateParentheses22 instance = new GenerateParentheses22();

	@Test
	public void test() {
		List<String> expect = new ArrayList<>()
		{{
			add("(())");
			add("()()");
		}};
		List<String> result = instance.generateParenthesis(2);
		Assertions.assertEquals(2, result.size());
		assertListEquals(result, expect);
	}
}
