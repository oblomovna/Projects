package com.company;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IsMultipliedTest {

    IsMultipliedNumbersFromList isMultiplied = new IsMultipliedNumbersFromList();
    @Test
    public void testIsMultiplied_null_false() {
        List<Integer> toTest = Arrays.asList();
        assertFalse(isMultiplied.isMultiplied(toTest, 0));
    }
    @Test
    public void testIsMultiplied_emptyList_false() {
        List<Integer> toTest = Arrays.asList();
        assertFalse(isMultiplied.isMultiplied(toTest, 1));
    }
    @Test
    public void testIsMultiplied_nullInAList_true() {
        List<Integer> toTest = Arrays.asList(0,2,5);
        assertTrue(isMultiplied.isMultiplied(toTest, 0));
    }
    @Test
    public void testIsMultiplied_60_true(){
        List<Integer> toTest = Arrays.asList(1,2,4,8,12,15,20);
        assertTrue(isMultiplied.isMultiplied(toTest,60));
    }
    @Test
    public void testIsMultiplied_1_false() {
        List<Integer> toTest = Arrays.asList(1, 2, 4, 8, 12, 15, 20);
        assertFalse(isMultiplied.isMultiplied(toTest, 1));
    }
    @Test
    public void testIsMultiplied_numberFromList_false() {
        List<Integer> toTest = Arrays.asList();
        assertFalse(isMultiplied.isMultiplied(toTest, 8));
    }
    @Test
    public void testIsMultiplied_64_false() {
        List<Integer> toTest = Arrays.asList(1, 2, 4, 8, 12, 15, 20);
        assertFalse(isMultiplied.isMultiplied(toTest, 64));
    }
    @Test
    public void testIsMultiplied_64andAnotherList_false() {
        List<Integer> toTest = Arrays.asList(1, 2, 4, 8, 9, 12, 15, 20);
        assertFalse(isMultiplied.isMultiplied(toTest, 81));
    }
    @Test
    public void testIsMultiplied_49andAnotherList_false() {
        List<Integer> toTest = Arrays.asList(4,5,7,8,10);
        assertFalse(isMultiplied.isMultiplied(toTest, 49));
    }
}