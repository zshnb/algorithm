package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReductionOperationsToMakeTheArrayElementsEqual1887Test {
	private ReductionOperationsToMakeTheArrayElementsEqual1887 instance = new ReductionOperationsToMakeTheArrayElementsEqual1887();

	@Test
	public void test() {
		Assertions.assertEquals(3, instance.reductionOperations(new int[]{5,1,3}));
		Assertions.assertEquals(0, instance.reductionOperations(new int[]{1,1,1}));
		Assertions.assertEquals(4, instance.reductionOperations(new int[]{1,1,2,2,3}));
	}
}
