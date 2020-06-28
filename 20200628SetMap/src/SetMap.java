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
            System.out.println(getAB1(map));
            System.out.println(getAB1(map2));
            String[] chars = {"a", "b", "a", "c", "b"};
            System.out.println("4");
            List<String> names4 = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Maria", "Ivan");
            System.out.println(getNumberOfOccurrencesOfNamesInAList4(names4, "Maria"));


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
        public static Map<String, String> getAB1(Map<String, String> map) {
            if (map.containsKey("a") && map.containsKey("b")) {
                map.put("ab", map.get("a") + map.get("b"));
            } else {
            }
            return map;
        }
     /*public static Map<String, Boolean> wordMultiple2(String[] strings){


    }*/


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
    }

