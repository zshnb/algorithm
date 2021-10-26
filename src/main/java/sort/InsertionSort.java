package sort;

public class InsertionSort {
    public void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            /*
             [0, i)部分的数组已经有序，每次容纳一个新元素进来时，通过下面的循环将其插入到正确的位置
             初始版本是通过交换数组中2个索引处的值完成的，频繁地交换会导致性能变差，因此有如下的优化
             在每次插入前先复制当前元素，然后在子循环里判断当前元素是否比前一元素小，如果是，把前一个元素的值复制到当前元素，继续子循环，直到当前
             元素比前一个元素大，结束子循环，把一开始复制的值赋值到子循环结束时下标处。
             */
            int temp = nums[i];
            int j;
            for (j = i; j > 0 && nums[j - 1] > temp; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = temp;
        }
    }
}
