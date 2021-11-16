package sort;

public class MergeSort {
    public void sort(int[] nums) {
        splitAndSort(nums, 0, nums.length - 1);
    }

    /**
     * 拆分原数组为[l, m],[m+1,r]的子数组，分别对子数组进行排序
     * */
    private void splitAndSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        splitAndSort(nums, l, mid);
        splitAndSort(nums, mid + 1, r);
        merge(nums, l, mid, r);
    }

    /**
     * 将2个子数组合并成一个有序的子数组，思路跟合并2个有序链表类似，通过2个指针分别指向2个子数组，比较指针处元素大小，让小的指针指向的元素复制到
     * 临时数组，然后指针往前移动，需要注意边界问题，左边数组的指针不能超过m，右边数组的指针不能超过r
     * */
    private void merge(int[] nums, int l, int m, int r) {
        int[] tempArray = new int[nums.length];
        System.arraycopy(nums, 0, tempArray, 0, nums.length);
        int i = l, j = m + 1, k = l;
        while (i <= m && j <= r) {
            if (tempArray[i] < tempArray[j]) {
                nums[k] = tempArray[i];
                i += 1;
            } else {
                nums[k] = tempArray[j];
                j += 1;
            }
            k += 1;
        }
        if (i == m + 1) {
            while (j <= r) {
                nums[k] = tempArray[j];
                j += 1;
                k += 1;
            }
        } else {
            while (i <= m) {
                nums[k] = tempArray[i];
                i += 1;
                k += 1;
            }
        }
    }
}
