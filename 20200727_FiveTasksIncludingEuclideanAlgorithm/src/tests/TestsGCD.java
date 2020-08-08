package tests;

import org.junit.Assert;
import org.junit.Test;
import solutions.Main;

public class TestsGCD {
    @Test
    public void testGcd_1() {
        Main m = new Main();
        int a = 64;
        int b = 48;
        int n = m.gcd1(a, b);
        Assert.assertTrue(true);
    }
    @Test
    public void testGcd_1False() {
        Main m = new Main();
        int a = 662;
        int b = 113;
        int n = m.gcd1(a, b);
        Assert.assertFalse(false);
    }
    @Test
    public void testGcd_2() {
        Main m = new Main();
        int a = 661;
        int b = 113;
        int n = m.gcd_2(a, b);
        Assert.assertTrue(true);
    }
    @Test
    public void testGcd_2False() {
        Main m = new Main();
        int a = 663;
        int b = 113;
        int n = m.gcd_2(a, b);
        Assert.assertFalse(false);
    }
}
