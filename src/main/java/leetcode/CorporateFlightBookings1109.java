package leetcode;

/**
 * 思路1：暴力遍历二维数组中每个一维数组，累加对应编号的航班数
 * 思路2：差分数组，first处加上seat, last+1处减去seat（除了末尾情况）
 * */
public class CorporateFlightBookings1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] preserveSeats = new int[n];
        for (int[] booking : bookings) {
            for (int i = booking[0];i <= booking[1];i++) {
                preserveSeats[i - 1] += booking[2];
            }
        }
        return preserveSeats;
    }
    public int[] corpFlightBookings2(int[][] bookings, int n) {
        int[] preserveSeats = new int[n];
        for (int[] booking : bookings) {
            int first = booking[0];
            int last = booking[1];
            int seat = booking[2];
            preserveSeats[first - 1] += seat;
            if (last < preserveSeats.length) {
                preserveSeats[last] -= seat;
            }
        }
        for (int i = 1; i < preserveSeats.length; i++) {
            preserveSeats[i] += preserveSeats[i - 1];
        }
        return preserveSeats;
    }
}
