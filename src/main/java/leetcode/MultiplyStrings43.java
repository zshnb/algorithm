package leetcode;

/**
 * 思路1：使用矩阵保存竖乘的中间过程，然后遍历矩阵，计算每一位的累加和
 * */
public class MultiplyStrings43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int row = Math.min(num1.length(), num2.length());
        int column = Math.max(num1.length(), num2.length()) + row;
        int count = 1;
        int[][] matrix = new int[row][column];
        int matrixRow = 0;
        int matrixColumn = matrix[0].length - 1;

        char[] chars1;
        char[] chars2;
        if (num1.length() < num2.length()) {
            chars1 = num1.toCharArray();
            chars2 = num2.toCharArray();
        } else {
            chars1 = num2.toCharArray();
            chars2 = num1.toCharArray();
        }
        int flag = 0;
        for (int i = chars1.length - 1; i >= 0; i--) {
            for (int j = chars2.length - 1; j >= 0; j--) {
                int multipleResult = (chars1[i] - '0') * (chars2[j] - '0') + flag;
                if (multipleResult >= 10) {
                    if (j == 0) {
                        matrix[matrixRow][matrixColumn] = multipleResult % 10;
                        matrix[matrixRow][matrixColumn - 1] = multipleResult / 10;
                        break;
                    } else {
                        flag = multipleResult / 10;
                        multipleResult %= 10;
                    }
                } else {
                    flag = 0;
                }
                matrix[matrixRow][matrixColumn] = multipleResult;
                matrixColumn -= 1;
            }
            flag = 0;
            matrixRow += 1;
            matrixColumn = matrix[0].length - 1 - count;
            count += 1;
        }

        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = column - 1;j >= 0;j--) {
            for (int i = 0;i < row;i++) {
                sum += matrix[i][j];
            }
            sum += flag;
            if (sum >= 10){
                stringBuilder.insert(0, sum % 10);
                flag = sum / 10;
            } else {
                stringBuilder.insert(0, sum);
                flag = 0;
            }
            sum = 0;
        }
        if (stringBuilder.indexOf("0") == 0) {
            return stringBuilder.substring(stringBuilder.indexOf("0") + 1);
        } else {
            return stringBuilder.toString();
        }
    }
}
