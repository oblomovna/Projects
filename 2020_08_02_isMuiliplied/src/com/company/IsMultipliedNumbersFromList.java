package com.company;

import java.util.ArrayDeque;
import java.util.List;

public class IsMultipliedNumbersFromList {


    public static boolean isMultiplied(List<Integer> nums, int n) {
        ArrayDeque<Integer> deque = new ArrayDeque<>(nums);
        for (int i = 0; i <deque.size() ; i++) {
            while (deque.getFirst() * deque.getLast() == n)
                return true;
            if
            (deque.getFirst() * deque.getLast() < n) {
                deque.removeFirst();
            } else
                deque.removeLast();
        }
        return false;
    }
}

