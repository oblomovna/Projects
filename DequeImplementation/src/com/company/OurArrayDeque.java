package com.company;

import java.util.Iterator;

public class OurArrayDeque<T> implements OurDeque {

    int size;
    int firstEltIndex;
    final int capacity;

    final Object[] source;


    public OurArrayDeque(int capacity){
        this.capacity = capacity;
        source = new Object[capacity];
    }
    @Override
    public void addLast(Object elt) {
        if(size==capacity)
            throw new OurDequeOverFlowException();

        int nextIndex  = (firstEltIndex + size)%capacity;
        source[nextIndex] = elt;
        size++;
    }

    @Override
    public void addFirst(Object elt) {
        if(size==capacity)
            throw new OurDequeOverFlowException();

        if(firstEltIndex>0)
            firstEltIndex--;
        else
            firstEltIndex = capacity-1;
        source[firstEltIndex] = elt;
        size++;

    }

    @Override
    public Object removeFirst() {
        if(size==0)
            throw new OurDequeEmptyException();

        T result = (T) source[firstEltIndex];
        firstEltIndex = (firstEltIndex+1)%capacity;
        size--;
        return result;
    }

    @Override
    public Object getFirst() {
        if(size==0)
            throw new OurDequeEmptyException();

        return (T)source[firstEltIndex];
    }

    @Override
    public Object removeLast() {
        if(size==0)
            throw new OurDequeEmptyException();


        int lastIndex = (firstEltIndex+size-1)%capacity;
        size--;

        return (T)source[lastIndex];
    }

    @Override
    public Object getLast() {
        if(size==0)
            throw new OurDequeEmptyException();

        int lastIndex = (firstEltIndex+size-1)%capacity;
        return (T)source[lastIndex];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new DefaultIterator();
    }
    private class DefaultIterator implements Iterator<T>{
        /**
         * the number of the current element from 0 to (size-1)
         */
        int currentIndexNumber;

        @Override
        public boolean hasNext() {
            return currentIndexNumber<size;
        }

        @Override
        public T next() {
            int indexSourceToReturn = (firstEltIndex+currentIndexNumber)%capacity; //8 36   3+2%4=1
            currentIndexNumber++;
            return  (T) source[indexSourceToReturn];
        }
    }
}
