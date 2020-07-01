
import java.util.*;

public class SetMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        System.out.println("1");
        System.out.println(removeDuplicates1(names));
        System.out.println("2");
        System.out.println(getDuplicates2(names));
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "There");
        System.out.println("1");
        System.out.println(getMapAB1(map));
        System.out.println(getMapAB1(map2));
        System.out.println("2");
        String[] chars = {"a", "b", "a", "c", "b"};
        System.out.println(wordMultiple2(chars));
        System.out.println("3");
        List<String> isAnagram = Arrays.asList("anna","ivan","naan","vani","piotr","nana","navi");
        System.out.println(getAllOfAnagrams3(isAnagram,"anna"));

        System.out.println("4");
        List<String> names4 = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Maria", "Ivan");
        System.out.println(getNumberOfOccurrencesOfNamesInAList4(names4, "Maria"));
        System.out.println("5");
        String text = "в объявлении метода используется оператор throws," +
                " который надо обработать при вызове этого метода. Например: " +
                "имеется метод";
        System.out.println(whichWordIsFrequentText5(text));


    }

    public static List<String> removeDuplicates1(List<String> input) {
        HashSet<String> names = new HashSet<>();
        names.addAll(input);
        List<String> removedDuplicatesNames = new ArrayList<>();
        removedDuplicatesNames.addAll(names);
        return removedDuplicatesNames;
    }

    public static List<String> getDuplicates2(List<String> input) {
        Set<String> set = new HashSet<>();
        List<String> listOfDuplicates = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            boolean b = set.add(input.get(i));
            if (b == false) {
                listOfDuplicates.add(input.get(i));
            }
        }
        return listOfDuplicates;

    }

    public static Map<String, String> getMapAB1(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        } else {
        }
        return map;
    }

    public static Map<String, Boolean> wordMultiple2(String[] strings) {
        List<String> chars = Arrays.asList(strings);
        Collections.sort(chars);
        System.out.println(chars);
        HashMap<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < chars.size(); i++) {
            if (getNumberOfOccurrencesOfNamesInAList4(chars, chars.get(i)) > 1) {
                map.put(chars.get(i), true);
            } else {
                map.put(chars.get(i), false);
            }
        }
        return map;
    }

    public static List<String> getAllOfAnagrams3(List<String> list, String string) {
        //HashMap<String, String> map = new HashMap<>();
        char[] name = string.toCharArray();
        Arrays.sort(name);
        List<String> anagrams = new ArrayList<>();
        for (String str : list) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
             if (Arrays.equals(chars, name)) {
                 anagrams.add(str);
                 anagrams.remove(string);
             }
        }
        return anagrams;

    }


    public static Integer getNumberOfOccurrencesOfNamesInAList4(List<String> list, String name) {
        HashMap<String, Integer> map = new HashMap<>();
        Integer count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(name)) {
                map.put(name, count);
                count++;
            } else {
            }
        }
        return count;
    }

    public static String whichWordIsFrequentText5(String string) {
        int frequentWordKey = 0;
        String frequentWord = null;
        //  String words = string.replaceAll(",:.", " ");
        String[] words2 = string.split(" ");
        List<String> words3 = Arrays.asList(words2);
       // String [] ignore = {"на","под","не","в",",",":","."};
        //words3.remove(ignore);
        HashMap<Integer,String> map = new HashMap<>();
        for (String str : words3) {
            map.put(getNumberOfOccurrencesOfNamesInAList4(words3, str),str);
        }
        map.keySet();
        for (int keys: map.keySet()) {
            if(keys>frequentWordKey){
                frequentWordKey = keys;

            }
            frequentWord = map.get(frequentWordKey);

        }
        return frequentWord;
    }
}




