package leetcode;

/*
 * 思路1：用临时数组存储合并后的数组，双指针分别指向2个输入数组开头，比较大小，小的放入临时数组，指针后移，直到其中一个数组遍历完，再把另一个数组剩余元素放入临时数组
 * 思路2：把一个数组的值合并到另一个数组，排序数组
 * 思路3：双指针从数组末尾开始往前，比较2个数组对应的值，大的放入数组末尾，指针前移，直到其中一个数组遍历完，再把另一个数组剩余元素放入数组
 */
class Solution {
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int index1 = 0;
        int index2 = 0;
        int tempIndex = 0;
        while (index1 < m && index2 < n) {
            if (nums1[index1] < nums2[index2]) {
                temp[tempIndex++] = nums1[index1++];
            } else {
                temp[tempIndex++] = nums2[index2++];
            }
        }
        while (index1 < m) {
            temp[tempIndex++] = nums1[index1++];
        }
        while (index2 < n) {
            temp[tempIndex++] = nums2[index2++];
        }
        for (int i = 0; i < temp.length; i++) {
            nums1[i] = temp[i];
        }
    }
}
