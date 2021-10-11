package leetcode;

/**
 * 思路1：使用额外数组，从0开始对比2个数组下标处的值，如果数组1下标处<数组2下标处，把数组1下标处值放进额外数组，数组1下标++
 * 否则同理，直到有任意一个数组遍历结束，然后把未遍历结束的数组剩下元素复制进额外数组末尾
 * */
public class MergeSortArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int[] res = new int[m + n];
        int i = 0;
        int index1 = 0;
        int index2 = 0;
        while (index1 < m && index2 < n) {
            if (nums1[index1] >= nums2[index2]) {
                res[i] = nums2[index2];
                index2++;
            } else {
                res[i] = nums1[index1];
                index1++;
            }
            i++;
        }
        if (index1 < m) {
            System.arraycopy(nums1, index1, res, i, nums1.length - i);
        } else if (index2 < n) {
            System.arraycopy(nums2, index2, res, i, nums1.length - i);
        }
        System.arraycopy(res, 0, nums1, 0, nums1.length);
    }
}
