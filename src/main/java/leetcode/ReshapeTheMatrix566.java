package leetcode;

/**
 * 思路1：把原矩阵的数铺平存放在一维数组中，然后再遍历放回目标矩阵
 * 思路2：一维转二维，在一维遍历的过程中把下标转换为矩阵坐标（行号=下标/列数，列号=下标%列数）
 * */
public class ReshapeTheMatrix566 {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int index = 0;
		int[] tempStorage = new int[mat.length * mat[0].length];
		for (int i = 0;i < mat.length;i++){
			for (int j = 0;j < mat[i].length;j++) {
				tempStorage[index++] = mat[i][j];
			}
		}
		if (r * c > index || r * c < index) {
			return mat;
		}
		int[][] result = new int[r][c];
		index = 0;
		for (int i = 0;i < r;i++){
			for (int j = 0;j < c;j++) {
				result[i][j] = tempStorage[index++];
			}
		}
		return result;
	}

	public int[][] matrixReshape2(int[][] mat, int r, int c) {
		int originColumn = mat[0].length;
		int originMatrixSize = mat.length * mat[0].length;
		if (r * c != originMatrixSize) {
			return mat;
		}

		int[][] result = new int[r][c];
		for (int i = 0;i < originMatrixSize;i++) {
			int originY = i / originColumn;
			int originX = i % originColumn;
			int targetY = i / c;
			int targetX = i % c;
			result[targetY][targetX] = mat[originY][originX];
		}
		return result;
	}
}
