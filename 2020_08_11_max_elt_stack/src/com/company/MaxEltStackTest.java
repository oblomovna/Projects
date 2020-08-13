package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class MaxEltStackTest {
}


   /* MaxEltStack<Integer> stack;
    @BeforeEach
    public void init() {
        Comparator<Integer> defaultComparator = new DefaultIntegerComparator();
        //        stack = new MaxEltStack<>(defaultComparator);
        stack = new MaxEltStack<>();
    }

    @Test
    void testAddLast_addIntToEmpty_sameIntInSource() {
        stack.addLast(5);
        assertEquals(5, stack.getLast());
    }

    @Test
    void testAddLast_addIntToEmpty_sameIntInStorage() {
        stack.addLast(5);
        assertEquals(5, stack.getLast());
    }

    @Test
    void testGetMax_addIntToEmpty_maxIsInt() {
        stack.addLast(5);
        assertEquals(5, stack.getMax());
    }

    @Test
    void testGetMax_addSeveralAscendingInts_maxIsLastInt() {
        stack.addLast(5);
        stack.addLast(8);
        stack.addLast(13);
        assertEquals(13, stack.getMax());
    }

    @Test
    void testGetMax_addSeveralDescendingInts_maxIsFirstInt() {
        stack.addLast(13);
        stack.addLast(3);
        stack.addLast(-2);
        assertEquals(13, stack.getMax());
    }

    @Test
    void testGetMax_addSeveraIntsMaxIsNotLast_() {
        stack.addLast(1);
        stack.addLast(13);
        stack.addLast(-2);
        assertEquals(13, stack.getMax());
    }

    @Test
    void testRemoveLast_severalInts_returnsLast() {
        stack.addLast(2);
        stack.addLast(5);
        assertEquals(5, stack.removeLast());
    }

    @Test
    void testGetMax_severalIntsWithRemovalOfLastMax_2() {
        stack.addLast(2);
        stack.addLast(5);
        stack.removeLast();
        assertEquals(2, stack.getMax());
    }

    @Test
    void testGetMax_severalIntsWithRemovalOfLastNonMax_2() {
        stack.addLast(5);
        stack.addLast(2);
        stack.removeLast();
        assertEquals(5, stack.getMax());
    }

    @Test
    void testAddLastForSize_2Ints_2() {
        stack.addLast(1);
        stack.addLast(2);
        assertEquals(2, stack.size());
    }

    @Test
    void testRemoveForSize_2Ints_2() {
        stack.addLast(3);
        stack.addLast(2);
        stack.removeLast();
        assertEquals(1, stack.size());
    }

    @Test
    void testGetMax_emptyStack_emptyStackException() {
        assertThrows(OurEmptyStackException.class, () -> stack.getMax());
    }

    @Test
    void testRemoveLast_emptyStack_emptyStackException() {
        assertThrows(OurEmptyStackException.class, () -> stack.removeLast());
    }

    @Test
    public void testGetSize_emptyStack_0() {
        assertEquals(0, stack.size());
    }

    @Test
    public void testGetSizeAndAddElement_add1elt_1() {
        stack.addLast(5);
        assertEquals(1, stack.size());
    }

    @Test
    public void testGetSizeAndAddElement_add5elements_5() {
        stack.addLast(5);
        stack.addLast(-9);
        stack.addLast(0);
        stack.addLast(7);
        stack.addLast(-3);
        assertEquals(5, stack.size());
    }

    @Test
    public void testRemoveElement_emptyStack_throwsEmptyStackException() {
        assertThrows(OurEmptyStackException.class, () -> stack.removeLast());
    }

    @Test
    public void testRemoveElement_add1EltAndRemove_5() {
        stack.addLast(5);
        assertEquals(5, stack.removeLast());
    }

    @Test
    public void testGetTop_emptyStack_throwsEmptyStackException() {
        assertThrows(OurEmptyStackException.class, () -> stack.getLast());
    }

    @Test
    public void testGetTop_add1Elt_98() {
        stack.addLast(98);
        assertEquals(98, stack.getLast());
    }

    @Test
    public void testGetTop_add4Elements_10() {
        stack.addLast(98);
        stack.addLast(9);
        stack.addLast(8);
        stack.addLast(10);
        assertEquals(10, stack.getLast());
    }

    @Test
    public void testGetMaxValue_emptyStack_throwsEmptyStackException() {
        assertThrows(OurEmptyStackException.class, () -> stack.getMax());
    }

    @Test
    public void testGetMaxValue_add1Elt_4() {
        stack.addLast(4);
        assertEquals(4, stack.getMax());
    }

    @Test
    public void testGetMaxValue_add4Elements_98() {
        stack.addLast(98);
        stack.addLast(9);
        stack.addLast(8);
        stack.addLast(10);
        assertEquals(98, stack.getMax());
    }

    @Test
    public void testGetMaxValue_add2RepeatingElements_100() {
        stack.addLast(98);
        stack.addLast(100);
        stack.addLast(8);
        stack.addLast(100);
        stack.addLast(10);
        assertEquals(100, stack.getMax());
    }

    @Test
    public void testGetMaxValue_add3RepeatingElements_101() {
        stack.addLast(101);
        stack.addLast(101);
        stack.addLast(98);
        stack.addLast(101);
        stack.addLast(98);
        assertEquals(101, stack.getMax());
    }

    @Test
    public void testAddRemoveMix_severalElementsAdded_removeSeveralElements() {
        stack.addLast(3);
        stack.addLast(8);
        assertEquals(8, stack.removeLast());
        stack.addLast(-5);
        stack.addLast(-2);
        stack.addLast(7);
        stack.addLast(10);
        assertEquals(10, stack.removeLast());
        stack.addLast(13);
        assertEquals(13, stack.getLast());
        assertEquals(5, stack.size());
    }
}*/