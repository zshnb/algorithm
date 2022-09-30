package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路1：遍历矩阵记录所有0的坐标，然后遍历坐标，原地修改矩阵
 * */
public class ZeroMatrixLcci1_8 {
    public void setZeroes(int[][] matrix) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    points.add(new Point(i, j));
                }
            }
        }

        for (Point point : points) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][point.y] = 0;
            }
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[point.x][i] = 0;
            }
        }
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
