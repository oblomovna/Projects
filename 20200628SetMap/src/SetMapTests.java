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
        Map<String, String> map = sm.getMapAB1(map2);
        Map<String, String> expected = map2;
        Assert.assertEquals(map, expected);
    }
    @Test
    public void testGetAllOfAnagrams3(){
        SetMap sm = new SetMap();
        List<String> isAnagram = Arrays.asList("anna","ivan","naan","vani","piotr","nana","navi");
        List<String> anagrams = sm.getAllOfAnagrams3(isAnagram,"ivan");
        List<String> expected = Arrays.asList("vani","navi");
        Assert.assertEquals(expected,anagrams);
    }

    @Test
    public void testGetNumberOfOccurrencesOfNamesInAList4() {
        SetMap sm = new SetMap();
        List<String> names4 = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Maria", "Ivan");
        Integer count = sm.getNumberOfOccurrencesOfNamesInAList4(names4, "Maria");
        Integer expected = 3;
        Assert.assertEquals(count, expected);
    }
    @Test
    public void tesWordMultiple2() {
        SetMap sm = new SetMap();
        String[] chars = {"a", "b", "c", "b"};
        Map<String, Boolean> map = sm.wordMultiple2(chars);
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", false);
        expected.put("b", true);
        expected.put("c", false);
        Assert.assertEquals(expected, map);
    /*@Test
    public void test*/
    }


}

