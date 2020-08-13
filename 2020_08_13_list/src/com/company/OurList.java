package com.company;

import java.util.Comparator;

/**
 * Standard list data structure
 * @param <T>
 */
public interface OurList<T> extends Iterable<T>{

    public void add(T elt);
    public int size();
    public void set(int index, T elt);
    public Object get(int index);

    /**
     *
     * @param index
     * @return the element tobe removed
     */
    public T remove(int index);

    /**
     *
     * @param elt
     * @return true if the elt found and removed
     */
    public boolean remove(T elt);
    public boolean contains(T elt);
    public void sort();
    public  void sort(Comparator<T> comparator);


}
