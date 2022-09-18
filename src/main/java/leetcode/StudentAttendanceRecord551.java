package leetcode;

/**
 * 思路1：使用2个计数器记录A的总数以及连续出现L的总数
 * */
public class StudentAttendanceRecord551 {
    public boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        int aCount = 0;
        int lCount = 0;
        boolean continuousL = false;
        for (char aChar : chars) {
            if (aChar == 'A') {
                lCount = 0;
                continuousL = false;
                aCount += 1;
                if (aCount >= 2) {
                    return false;
                }
            } else if (aChar == 'L') {
                lCount += 1;
                if (continuousL) {
                    if (lCount >= 3) {
                        return false;
                    }
                } else {
                    continuousL = true;
                }
            } else {
                lCount = 0;
                continuousL = false;
            }
        }
        return true;
    }
}
