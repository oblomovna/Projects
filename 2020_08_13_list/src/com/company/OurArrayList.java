package com.company;

import java.util.Arrays;
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
    static final int INITIAL_CAPACITY = 16;
    Object[] source;
    int size;

    public OurArrayList() {
        this.source = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }


    @Override
    public void add(T elt) {
        if (size == source.length){
            increaseSource();
            }
        source[size] = elt;
        size++;
    }
    private void increaseSource(){
        Object[] newSource = new Object[source.length*2];
        source = Arrays.copyOf(source,source.length*2);
      // System.arraycopy(source,0,newSource,0,source.length);
       source = newSource;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object eltToReturn
                = (T) source[index];
        System.arraycopy(source, index + 1, source, index, size - index - 1);
        size--;
        return (T) eltToReturn;
    }

    @Override
    public boolean remove(T elt) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(elt)) {
                System.arraycopy(source, i + 1, source, i, size - (i - 1));
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        if (index >= size && index<0)
            throw new IndexOutOfBoundsException();
        return (T) source[index];
    }

    @Override
    public boolean contains(T elt) {
        for (int i = 0; i < size; i++) {
            if (source[i] == elt)
                return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void set(int index, T elt) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else source[index] = elt;
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

