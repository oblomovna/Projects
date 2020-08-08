package com.company;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayDequeTest {
    OurArrayDeque<Integer> deque = new OurArrayDeque(16);

    Deque<Integer> deque1 = new ArrayDeque<>();

    @Test
    public void testSize_newInstance() {
        assertEquals(0, deque.size());


    }

    @Test
    public void testSize_addLast3Elements() {
        deque.addLast(5);
        deque.addLast(2);
        deque.addLast(7);

        assertEquals(3, deque.size());
    }

    @Test
    public void testSize_addFirst2ElementsAndLast1_3() {
        deque.addFirst(5);
        deque.addFirst(2);
        deque.addLast(1);


        assertEquals(3, deque.size());
    }

    @Test
    public void testAddLast_adds1elt_present() {
        deque.addLast(5);
        assertEquals(5, deque.getLast());

    }

    @Test
    public void testAddLast_adds3elt_present() {
        deque.addLast(5);
        deque.addLast(7);
        deque.addLast(-1);
        assertEquals(-1, deque.getLast());
    }

    @Test
    public void testAddFirst_adds3elt_getFirst() {
        deque.addFirst(5);
        deque.addFirst(7);
        deque.addFirst(-1);
        assertEquals(-1, deque.getFirst());
    }

    @Test
    public void testAddLast_adds1elt_getFirstGetLast() {
        deque.addLast(3);
        assertEquals(3, deque.getFirst());
        assertEquals(3, deque.getLast());
    }

    @Test
    public void testAddFirstAndLast_adds2elt_getFirstGetLast() {
        deque.addLast(3);
        deque.addFirst(8);
        assertEquals(8, deque.getFirst());
        assertEquals(3, deque.getLast());
    }

    @Test
    public void testAddFirstAndLast_adds5elt_getFirstGetLast() {
        deque.addFirst(3);
        deque.addFirst(8);
        deque.addFirst(4);
        deque.addLast(0);
        deque.addLast(-9);
        assertEquals(4, deque.getFirst());
        assertEquals(-9, deque.getLast());

        assertEquals(5, deque.size());
    }

    @Test
    public void testRemoveFirst_adds1elt_size() {
        deque.addFirst(3);
        assertEquals(1, deque.size());
    }

    @Test
    public void testRemoveLast_adds1elt_size() {
        deque.addLast(3);
        assertEquals(3, deque.removeLast());
        assertEquals(0, deque.size());
    }

    @Test
    public void testAddRemoveMix_severalElementsAdded_removeSeveralEl_() {
        deque.addLast(3);
        deque.addLast(8);
        assertEquals(8, deque.removeLast());
        deque.addFirst(-5);
        deque.addFirst(-2);
        deque.addFirst(7);
        deque.addLast(10);
        assertEquals(7, deque.removeFirst());
        deque.addLast(13);
        assertEquals(5, deque.size());
    }

    @Test
    public void testRemoveFirst_ThrowException() {
        assertThrows(OurDequeEmptyException.class, () -> deque.removeFirst());
    }

    @Test
    public void testRemoveLast_ThrowException() {
        assertThrows(OurDequeEmptyException.class, () -> deque.removeLast());
    }

    @Test
    public void testAddFirstFullDeque_2Capacity_ThrowOurDequeOverFlowException() {
        deque = new OurArrayDeque<>(2);
        deque.addLast(3);
        deque.addFirst(2);

        assertThrows(OurDequeOverFlowException.class, () -> deque.addFirst(5));
    }

    @Test
    public void testAddLast_2CapacityThrowException() {

        deque = new OurArrayDeque<>(2);
        deque.addLast(3);
        deque.addFirst(8);
        assertThrows(OurDequeOverFlowException.class, () -> deque.addLast(7));
    }

    @Test
    public void testIterator() {
        deque = new OurArrayDeque<>(2);
        deque.addLast(3);
        deque.addFirst(8);
        Iterator<Integer> iterator = new ReversedOurDequeIterator<>(deque);

        List<Integer> result = new ArrayList<>();
        while (iterator.hasNext()) {
            int current = iterator.next();
            result.add(current);

        }
        List<Integer> expected = Arrays.asList(3, 8);
        assertEquals(expected, result);
    }
    @Test
    public void testIteratorWithOneElement() {
        deque = new OurArrayDeque<>(2);
        deque.addLast(3);
        Iterator<Integer> iterator = new ReversedOurDequeIterator<>(deque);

        List<Integer> result = new ArrayList<>();
        while (iterator.hasNext()) {
            int current = iterator.next();
            result.add(current);

        }
        List<Integer> expected = Arrays.asList(3);
        assertEquals(expected, result);
    }
}