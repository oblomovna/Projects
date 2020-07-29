package tests;

import org.junit.Assert;
import org.junit.Test;
import solutions.Main;

public class TestPow {
    @Test
    public void testPow() {
        Main m = new Main();
        int n = 6;
        int res = m.pow(n);
        int expected = 36;
        Assert.assertEquals(expected, res);
    }
}
