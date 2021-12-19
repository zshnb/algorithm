import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.ArrayUtil;

public class SkipListTest {
	private SkipList skipList = new SkipList();

	@Test
	public void test() {
		int[] nums = IntStream.range(0, 11).toArray();
		for (int num : nums) {
			skipList.add(num);
		}

		skipList.print();
		for (int num : nums) {
			Assertions.assertEquals(num, skipList.find(num));
		}

		skipList.remove(10);
		skipList.print();
	}

	@Test
	public void search() {
		long millis = System.currentTimeMillis();

		int[] nums = ArrayUtil.generateRandomArray(10000, 0, 200000);
		for (int num : nums) {
			skipList.add(num);
		}

		skipList.find(nums[0]);

		System.out.println(System.currentTimeMillis() - millis + "ms");
	}
}
