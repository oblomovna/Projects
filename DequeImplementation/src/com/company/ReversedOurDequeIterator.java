package com.company;

import java.util.Iterator;

public class ReversedOurDequeIterator <T> implements Iterator<T> {

    OurArrayDeque<T> toIterate;
    int currentIndex;

    public ReversedOurDequeIterator(OurArrayDeque<T> toIterate){
        this.toIterate = toIterate;
        currentIndex = toIterate.size;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >0;
    }

    @Override
    public T next() {
        int indexSourceToReturn = (toIterate.firstEltIndex+currentIndex-1)%toIterate.capacity;
        T res = (T) toIterate.source[indexSourceToReturn];
        currentIndex--;
        return res;

    }
}

