package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssignCookies455Test {
	@Test
	public void successful() {
		AssignCookies455 assignCookies455 = new AssignCookies455();
		Assertions.assertEquals(2, assignCookies455.findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
		Assertions.assertEquals(1, assignCookies455.findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
	}
}
