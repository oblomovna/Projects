package solutions;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 5, 5, 6, 7);
        List<Integer> list2 = Arrays.asList(1, 3, 8, 9, 11, 20);
        String string = "hello";
        char c = 'h';


        System.out.println("revers");
        System.out.println(revers(string));

        System.out.println("changeCase");
        System.out.println(changeCase(c));

        System.out.println("getRepeatedNumbers");
        System.out.println(getRepeatedNumbers(list));

        System.out.println("isMultiple1");
        System.out.println(isMultiple1(list2, 3));

        System.out.println("isMultiple2");
        System.out.println(isMultiple2(list2, 3));

        System.out.println("gcd2");
        System.out.println(gcd_1(64, 48));

        System.out.println("gcd3");
        System.out.println(gcd_2(64, 48));

        System.out.println("pow");
        System.out.println(pow(5));


    }

    public static String revers(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();

    }

    public static char changeCase(Character character) {
        if (character.isUpperCase(character)) {
            return character.toString().toLowerCase().charAt(0);
        } else {
            return character.toString().toUpperCase().charAt(0);
        }
    }

    public static List<Integer> getRepeatedNumbers(List<Integer> list) {
        Set<Integer> set = new HashSet();
        Set<Integer> setOfDuplicates = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            boolean b = set.add(list.get(i));
            if (!b) {
                setOfDuplicates.add(list.get(i));
            }
        }
        return new ArrayList<>(setOfDuplicates);
    }

    public static boolean isMultiple1(List<Integer> list, int num) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++)
                if (j != i && list.get(j) * list.get(i) == num) {
                    return true;
                } else {
                }
        }
        return false;
    }

    public static boolean isMultiple2(List<Integer> list, int num) {
        for (int i = 0; i < list.size(); i++) {
            if (num % list.get(i) == 0 && list.contains(num / list.get(i)) && num / list.get(i) != list.get(i)) {
                return true;
            }
        }
        return false;
    }

    public static int gcd_1(int a, int b) {
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int gcd_2(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int pow(int a) {
        List<Integer> nums = new ArrayList<>();
        int count = 0;
        int n = -1;
        while (count < a) {
            n = n + 2;
            count++;
            nums.add(n);
        }
        int pow = 0;
        for (int i = 0; i < nums.size(); i++) {
            pow += nums.get(i);
        }
        return pow;
    }
}

