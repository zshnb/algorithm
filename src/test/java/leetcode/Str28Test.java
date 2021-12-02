package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Str28Test {
	private Str28 instance = new Str28();

	@Test
	public void test() {
		Assertions.assertEquals(2, instance.strStr("hello", "ll"));
	}
}
