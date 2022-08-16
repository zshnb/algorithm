package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路：遍历所有奇数情况，对于每一种情况，使用滑动窗口求窗口内的子和，再累加结果上
 * */
public class SumOfAllOddLengthSubarrays1588 {
	public int sumOddLengthSubarrays(int[] arr) {
		List<Integer> odds = new ArrayList<>();
		for (int i = 1; i <= arr.length; i++) {
			if (i % 2 != 0) {
				odds.add(i);
			}
		}
		int sum = 0;
		for (Integer odd : odds) {
			int left = 0, right = odd;
			int subSum = 0;
			for (int i = 0; i < odd; i++) {
				subSum += arr[i];
			}
			sum += subSum;
			while (right < arr.length) {
				subSum -= arr[left];
				left += 1;
				subSum += arr[right];
				right += 1;
				sum += subSum;
			}
		}
		return sum;
	}
}
