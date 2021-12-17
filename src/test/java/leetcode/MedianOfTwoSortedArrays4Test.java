package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianOfTwoSortedArrays4Test {
	private MedianOfTwoSortedArrays4 instance = new MedianOfTwoSortedArrays4();

	@Test
	public void test() {
		Assertions.assertEquals(2.5, instance.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
	}

	@Test
	public void test2() {
		Assertions.assertEquals(2.5, instance.findMedianSortedArrays2(new int[]{1,2}, new int[]{3,4}));
	}
}
