package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import solutions.Main;

import java.util.Arrays;
import java.util.List;

public class TestIsMultiple {

    @Test
    public void TestIsMultiple1(){
        Main m = new Main();
        List<Integer> list2 = Arrays.asList(3, 8, 9, 11, 20);
        boolean b = m.isMultiple1(list2,24);
        Assert.assertTrue(true);
    }
    @Test
    public void TestIsMultiple2(){
        Main m = new Main();
        List<Integer> list2 = Arrays.asList(3, 8, 9, 11, 20);
        boolean b = m.isMultiple2(list2,64);
        Assert.assertFalse(false);
    }
}
