package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 思路1：贪心，根据每个箱子单元数倒序排序，然后从开头，判断剩余箱子数是否满足当前单元箱子数，一直取最大数
 * */
public class MaximumUnitsTruck1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        List<List<Integer>> list = new ArrayList<>();
        for (int[] boxType : boxTypes) {
            list.add(Arrays.asList(boxType[0], boxType[1]));
        }
        list.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.get(1).compareTo(o1.get(1));
            }
        });

        int result = 0;
        for (List<Integer> integers : list) {
            if (truckSize >= integers.get(0)) {
                result += integers.get(0) * integers.get(1);
                truckSize -= integers.get(0);
            } else {
                result += truckSize * integers.get(1);
                break;
            }
        }
        return result;
    }
}
