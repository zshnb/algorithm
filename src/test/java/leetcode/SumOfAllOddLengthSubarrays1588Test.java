package leetcode;

import org.junit.jupiter.api.Test;

public class SumOfAllOddLengthSubarrays1588Test {
	@Test
	public void test1() {
		SumOfAllOddLengthSubarrays1588 solution = new SumOfAllOddLengthSubarrays1588();
		int result = solution.sumOddLengthSubarrays(new int[]{1,4,2,5,3});
		System.out.println(result);
	}
}
