package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CorporateFlightBookings1109Test {
    @Test
    public void successful() {
        CorporateFlightBookings1109 obj = new CorporateFlightBookings1109();
        Assertions.assertArrayEquals(new int[]{10,55,45,25,25}, obj.corpFlightBookings(new int[][]{
            {1,2,10},
            {2,3,20},
            {2,5,25}
        }, 5));
    }

    @Test
    public void successful2() {
        CorporateFlightBookings1109 obj = new CorporateFlightBookings1109();
        Assertions.assertArrayEquals(new int[]{10,55,45,25,25}, obj.corpFlightBookings2(new int[][]{
            {1,2,10},
            {2,3,20},
            {2,5,25}
        }, 5));
    }
}
