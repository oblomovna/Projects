package com.company;

import java.util.Comparator;

public class DefaultIntegerComparator implements Comparator<Integer> {



    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
