package dp;

public class Fib {
    public int withRecursive(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return withRecursive(n - 1) + withRecursive(n - 2);
    }

    public int withMemory(int n, int[] memory) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        memory[n] = withMemory(n - 1, memory) + withMemory(n - 2, memory);
        return memory[n];
    }

    public int withDp(int n) {
        long[] dpTable = new long[n + 1];
        dpTable[0] = dpTable[1] = 1;
        for (int i = 2; i < n; i++) {
            dpTable[i] = dpTable[i - 1] + dpTable[i - 2];
        }
        return Math.toIntExact(dpTable[n - 1]);
    }

    public int longestESR(int[] sales) {
        // 维持一个最大销售区间，当加入的数字导致区间不成立，重置索引为当前索引
        int result = 0;
        int failedDay = 0;
        int successDay = 0;
        for (int i = 0;i < sales.length;i++) {
            for (int j = i;j < sales.length;j++) {
                if (sales[j] <= 8) {
                    failedDay += 1;
                } else {
                    successDay += 1;
                }
                if (successDay > failedDay) {
                    result = Math.max(result, successDay + failedDay);
                }
            }
            successDay = 0;
            failedDay = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int res = new Fib().longestESR(new int[]{9,9,6,0,6,6,9});
        System.out.println(res);
    }
}
