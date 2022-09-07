package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum15Test {
	@Test
	public void successful() {
		ThreeSum15 threeSum15 = new ThreeSum15();
		List<List<Integer>> result = threeSum15.threeSum(new int[]{-1,0,1,2,-1,-4});
		for (List<Integer> list : result) {
			System.out.println(list.stream().map(Object::toString).collect(Collectors.joining(",")));
		}

		System.out.println("===");
		result = threeSum15.threeSum(new int[]{0,0,0,0});
		for (List<Integer> list : result) {
			System.out.println(list.stream().map(Object::toString).collect(Collectors.joining(",")));
		}

		System.out.println("===");
		result = threeSum15.threeSum(new int[]{-1,0,1,0});
		for (List<Integer> list : result) {
			System.out.println(list.stream().map(Object::toString).collect(Collectors.joining(",")));
		}
	}
}
