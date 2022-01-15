package leetcode;

/**
 * 思路：简单数学计算过程，模拟存钱过程即可
 * */
public class CalculateMoneyInLeetcodeBank1716 {
    public int totalMoney(int n) {
        int oneWeekMoneySum = 28;
        int maintainDay = n % 7;
        if (maintainDay == n) {
            int sum = 0;
            for (int i = 1;i <= n;i++) {
                sum += i;
            }
            return sum;
        } else {
            int sum = 0;
            int weeks = (n / 7);
            while (weeks > 0) {
                sum += oneWeekMoneySum;
                oneWeekMoneySum += 7;
                weeks -= 1;
            }
            int money = 1 + (n / 7);
            for (int i = 1;i <= maintainDay;i++) {
                sum += money;
                money += 1;
            }
            return sum;
        }
    }
}
