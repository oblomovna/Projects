package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayListTest {
    OurArrayList<Integer> list;

    @BeforeEach
    void init() {
        list = new OurArrayList<>();
    }

    @Test
    void testAdd_oneElt_size1() {
        list.add(1);
        assertEquals(1,list.size());
    }
    @Test
    void testAdd_oneElt_elt1() {
        list.add(1);
        assertEquals(1, list.get(0));
    }
    @Test
    void testGet_Exception(){
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(8);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(9));

    }
    @Test
    void testAdd_FiveElt_size5() {
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(8);
        assertEquals(5,list.size());
    }

    @Test
    void testAdd_multipleElements_getElt() {
        list.add(2);
        list.add(10);
        list.add(15);
        list.add(21);
        assertEquals(2,list.get(0));
        assertEquals(10,list.get(1));
        assertEquals(15,list.get(2));
        assertEquals(21,list.get(3));
    }

}