import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SetMapTests {
    @Test
    public void testRemoveDuplicates1() {
        SetMap sm = new SetMap();
        List<String> names = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        List<String> removedDuplicatesNames = sm.removeDuplicates1(names);
        List<String> expected = Arrays.asList("Ivan", "Maria", "Piotr", "Anna");
        Assert.assertEquals(removedDuplicatesNames, expected);
    }

    @Test
    public void testGetDuplicates2() {
        SetMap sm = new SetMap();
        List<String> names = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        List<String> removedDuplicatesNames = sm.getDuplicates2(names);
        List<String> expected = Arrays.asList("Maria", "Ivan");
        Assert.assertEquals(removedDuplicatesNames, expected);
    }

    @Test
    public void testGetAB1() {
        SetMap sm = new SetMap();
        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "There");
        Map<String, String> map = sm.getAB1(map2);
        Map<String, String> expected = map2;
        Assert.assertEquals(map, expected);
    }

    @Test
    public void testGetNumberOfOccurrencesOfNamesInAList4() {
        SetMap sm = new SetMap();
        List<String> names4 = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Maria", "Ivan");
        Integer count = sm.getNumberOfOccurrencesOfNamesInAList4(names4, "Maria");
        Integer expected = 3;
        Assert.assertEquals(count, expected);
    }
    /*@Test
    public void test*/


}

