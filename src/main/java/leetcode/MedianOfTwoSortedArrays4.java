package leetcode;

import java.util.Arrays;

/**
 * 思路1：把给的2个数组拼成一个大数组，排序后求中位数<br/>
 * 思路2：双路遍历2个数组拼成一个大数组，优化为O(N)
 * */
public class MedianOfTwoSortedArrays4 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] array = new int[nums1.length + nums2.length];
		System.arraycopy(nums1, 0, array, 0, nums1.length);
		System.arraycopy(nums2, 0, array, nums1.length, nums2.length);
		Arrays.sort(array);
		int middle = array.length / 2;
		if (array.length % 2 == 0) {
			return (array[middle] + array[middle - 1]) / 2.0;
		} else {
			return array[middle];
		}
	}

	public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
		int index = 0;
		int i = 0, j = 0;
		int[] array = new int[nums1.length + nums2.length];
		while (i < nums1.length || j < nums2.length) {
			if (i >= nums1.length) {
				array[index] = nums2[j];
				j += 1;
			} else if (j >= nums2.length) {
				array[index] = nums1[i];
				i += 1;
			} else if (nums1[i] < nums2[j]) {
				array[index] = nums1[i];
				i += 1;
			} else {
				array[index] = nums2[j];
				j += 1;
			}
			index += 1;
		}
		int middle = array.length / 2;
		if (array.length % 2 == 0) {
			return (array[middle] + array[middle - 1]) / 2.0;
		} else {
			return array[middle];
		}
	}
}
