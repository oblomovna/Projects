package com.company;

import java.util.Comparator;
import java.util.Iterator;

/**
 * An implementation of the List data structure, made via array under the hood.
 * The initial array has length 16. In the case the array is full, a new array with the capacity
 * of2*<old length> must be created as a new source for the elements.
 * </old>
 * @param <T>
 */

public class OurArrayList<T> implements OurList<T>{
    Object[] source;
    int size;

    public OurArrayList() {
        this.source = new Object[16];
        this.size = 0;
    }


    @Override
    public void add(T elt) {
        if (size == source.length){
            Object[] newSource = new Object[source.length*2];
            for (int i = 0; i < source.length; i++) {
                newSource[i] = source[i];
            }
            source = newSource;
        }
        source[size++] = elt;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean remove(T elt) {
        return false;
    }

    @Override
    public T get(int index) {
        if (index > size)
            throw new IndexOutOfBoundsException();
        return (T) source[index];
    }

    @Override
    public boolean contains(T elt) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void set(int index, T elt) {

    }

    @Override
    public void sort() {
    }

    @Override
    public void sort(Comparator<T> comparator) {
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}

