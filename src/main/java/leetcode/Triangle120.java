package leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * 思路1：dp解法，dpTable[i][j]表示从顶点到某一个节点的最小路径和，每一层的每一个节点路径最小和等于节点本身加上上一层的最小和，从上往下还是相反的方向都可以
 * 从顶点出发，计算下一层相邻两个节点的最小路径和，放入dpTable，算完最后一层遍历得到最小值
 * 思路2：根据思路1的解法，其实不需要dpTable，在从上往下的过程中，只需要原地替换掉下一层节点的值为当前节点值+下一层节点的值即可。
 * */
public class Triangle120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dpTable = new int[triangle.size()][triangle.size()];
        for (int[] ints : dpTable) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }
        dpTable[0][0] = triangle.get(0).get(0);
        for (int i = 0; i < triangle.size() - 1; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dpTable[i + 1][j] = Math.min(dpTable[i + 1][j], dpTable[i][j] + triangle.get(i + 1).get(j));
                dpTable[i + 1][j + 1] = Math.min(dpTable[i + 1][j + 1], dpTable[i][j] + triangle.get(i + 1).get(j + 1));
            }
        }
        int min = dpTable[dpTable.length - 1][dpTable[dpTable.length - 1].length - 1];
        for (int i : dpTable[dpTable.length - 1]) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
