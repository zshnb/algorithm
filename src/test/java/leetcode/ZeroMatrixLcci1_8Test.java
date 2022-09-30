package leetcode;

import org.junit.jupiter.api.Test;

public class ZeroMatrixLcci1_8Test {

    @Test
    public void successful() {
        ZeroMatrixLcci1_8 obj = new ZeroMatrixLcci1_8();
        int[][] matrix = new int[][]{
            {1,1,1,},
            {1,0,1},
            {1,1,1,}
        };
        obj.setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        matrix = new int[][]{
            {0,1},
        };
        obj.setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
