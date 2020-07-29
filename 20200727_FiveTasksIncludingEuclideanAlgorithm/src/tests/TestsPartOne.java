package tests;

import org.junit.Assert;
import org.junit.Test;
import solutions.Main;

import java.util.Arrays;
import java.util.List;

public class TestsPartOne {


    @Test
    public void testRevers() {
        Main m = new Main();
        String string = "hello";
        String newString = m.revers(string);
        String expected = "olleh";
        Assert.assertEquals(newString, expected);

    }
    @Test
    public void testChangeCase(){
        Main m = new Main();
        char c = 'h';
        char newChar = m.changeCase(c);
        char expected = 'H';
        Assert.assertEquals(newChar,expected);

    }

    @Test
    public void testGetRepeatedNumbers() {
        Main m = new Main();
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 5, 6, 7);
        List<Integer> getRepeatedNumbers = m.getRepeatedNumbers(list);
        List<Integer> expected = Arrays.asList(2, 5);
        Assert.assertEquals(getRepeatedNumbers, expected);
    }
}
