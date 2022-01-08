package leetcode;

import org.junit.jupiter.api.Test;

public class IntegerToRoman12Test {
    private IntegerToRoman12 instance = new IntegerToRoman12();

    @Test
    public void test1() {
        System.out.println(instance.intToRoman(3));
        System.out.println(instance.intToRoman(4));
        System.out.println(instance.intToRoman(9));
        System.out.println(instance.intToRoman(58));
        System.out.println(instance.intToRoman(1994));
    }
}
